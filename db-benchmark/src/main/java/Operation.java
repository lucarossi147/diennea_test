import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * class used to make dml operations in the database
 * @author luca
 *
 */
public class Operation {
	
	private DBConnection connection;
    private String TABLE_NAME = "persona";// "person"; //
    
    public Operation() {
		this.connection = new DBConnection();
	}
    /**
     * 
     * @return the next available id in the database
     */
    private int nextId() {
    	int max_id = 0;
    	String sql = "SELECT MAX(person_id) from "+TABLE_NAME;
    	Connection connection = this.connection.getConnection();

    	PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
            	max_id = rs.getInt(1);
            	max_id++;
            }else { //still not potulated
            	max_id = -1;
            }
        }
        catch (SQLException e) {
        	new Exception(e.getMessage());
            System.out.println("Error"+ e.getMessage());
        }
        finally {
            try {
                if (statement != null) 
                    statement.close();
                if (connection!= null)
                    connection.close();
            }
            catch (SQLException e) {
            	new Exception(e.getMessage());
	            System.out.println("Errore"+ e.getMessage());
            }
        }
		return max_id;
    }
    
    /**
     * delete from database the person with the specified id
     * @param id the id of the person to delete
     */
    public void delete(List<Integer> id) {
    	
        Connection connection = this.connection.getConnection();
        PreparedStatement delete = null;
        String SQL = "delete from "+ TABLE_NAME +" where person_id = ?";
        try {
        	connection.setAutoCommit(false);
        	delete = connection.prepareStatement(SQL);
        	for (Integer i : id) {
        		delete.setInt(1, i);
        		delete.executeUpdate();
        	}
        	connection.commit();
        }
        catch (SQLException e) {
        	new Exception(e.getMessage());
            System.out.println("Error"+ e.getMessage());
        }
        finally {
            try {
                if (delete != null) 
                	delete.close();
                if (connection!= null)
                    connection.close();
            }
            catch (SQLException e) {
            	new Exception(e.getMessage());
	            System.out.println("Errore"+ e.getMessage());
            }
        }
    }
    
    /**
     * insert a list of people in the db, it also generates the id 
     * for people who don't have one, it could have some problems in particular situations
     * it issues a commit only at the end of the list
     * @param people list of people to insert
     */
    public void insert(List<Person> people) {
    	/*gets the first person, if it still doesn't have an id it calls
    	nextId, then it generates it automatically, doesn't make controls to check if the
    	id is already in use*/
    	if (people.get(0).getId()==-1) {
    		int basicId = this.nextId();
    		for (Person person : people) {
        		if (person.getId()==-1) {
            		person.setId(basicId);
            		basicId++;
            	}
        	}
    	}
    	Connection connection = this.connection.getConnection();
        PreparedStatement insert = null;
        String SQL = "INSERT INTO " + TABLE_NAME + "(person_id, name, surname, age) VALUES(?,?,?,?)" ;
        try {
        	connection.setAutoCommit(false);
        	insert = connection.prepareStatement(SQL);
        	for (Person person : people) {
        		insert.setInt(1, person.getId());
        		insert.setString(2, person.getName());
        		insert.setString(3, person.getSurname());
        		insert.setInt(4, person.getAge());
        		insert.executeUpdate();
        	}
            connection.commit();
        }
        catch (SQLException e) {
        	new Exception(e.getMessage());
            System.out.println("Error"+ e.getMessage());
        }
        finally {
            try {
                if (insert != null) 
                	insert.close();
                if (connection!= null)
                    connection.close();
            }
            catch (SQLException e) {
            	new Exception(e.getMessage());
	            System.out.println("Errore"+ e.getMessage());
            }
        }
        
    }
    
    /**
     * modifies person's age.
     * @param modifies a map whose key is a list of person and values are the ages to update
     */
    public void updateAge(Map<Person,Integer> modifies) {
    	Connection connection = this.connection.getConnection();
        PreparedStatement modify = null;
        String SQL = "UPDATE " + TABLE_NAME + " SET age = ? WHERE person_id = ?";
        try {
        	connection.setAutoCommit(false);
        	modify = connection.prepareStatement(SQL);
        	for (Person p : modifies.keySet()) {
        		modify.setInt(1, modifies.get(p));
        		modify.setInt(2, p.getId());
        		modify.executeUpdate();
        	}
        	connection.commit();
        }
        catch (SQLException e) {
        	new Exception(e.getMessage());
            System.out.println("Error"+ e.getMessage());
        }
        finally {
            try {
                if (modify != null) 
                	modify.close();
                if (connection!= null)
                    connection.close();
            }
            catch (SQLException e) {
            	new Exception(e.getMessage());
	            System.out.println("Errore"+ e.getMessage());
            }
        }
	}
    
    /**
     * returns the Person for a specified id
     * @param code the Person to search
     * @return the Person with that id
     */
    public Person findByPrimaryKey(int code)  {
        Person person = null;
        
        Connection connection = this.connection.getConnection();
        PreparedStatement statement = null;
        String query = "select * from "+ TABLE_NAME +" where person_id=?";
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, code);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                person = new Person(result.getInt("person_id"),result.getString("name"), 
                		result.getString("surname"), result.getInt("age"));
                }
        }
        catch (SQLException e) {
        	new Exception(e.getMessage());
            System.out.println("Errore"+ e.getMessage());
        }
        finally {
            try {
                if (statement != null) 
                    statement.close();
                if (connection!= null)
                    connection.close();
            } catch (SQLException e) {
            	new Exception(e.getMessage());
	             System.out.println("Errore"+ e.getMessage());
            }
        }
        return person;
    }   
    
}


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;

/**
 * class used to measure time, it extends Operation
 * @author luca
 *
 */
public class Measurer extends Operation{
	
	/**
	 * service array containing time elapsed for select operations
	 */
	private List<Long> selectTime = new ArrayList<>();

	/**
	 * service array containing time elapsed for insert operations
	 */
    private List<Long> insertTime = new ArrayList<>();
    
    private void resetSelectTime() {
    	this.selectTime.clear();
    }
    
    private void resetInsertTime() {
    	this.insertTime.clear();
    }
    
    /**
     * 
     * @return the average time elapsed for the select operation
     */
    protected Double getAvgSelect() {
    	OptionalDouble avg = selectTime.stream().mapToLong(a->a).average();
    	return avg.isPresent()?avg.getAsDouble():-1;
    }
    
    /**
     * 
     * @return the average time elapsed for the insert operation
     */
    protected Double getAvgInsert() {
    	OptionalDouble avg = insertTime.stream().mapToLong(a->a).average();
    	return avg.isPresent()?avg.getAsDouble():-1;
    }
	
    /**
     * insert a list of people in the db, it also generates the id while measuring the time elapsed
     * for people who don't have one, it could have some problems in particular situations
     * it issues a commit only at the end of the list
     * @param people list of people to insert
     */
    public void measurerInsert(List<Person> people) {
    	Instant start = Instant.now();
    	this.insert(people);
    	Instant stop = Instant.now();
    	Duration timeElapsed = Duration.between(start, stop);
    	this.insertTime.add(timeElapsed.toMillis());
    }
    
    /**
     * returns the Person for a specified id while measuring the time elapsed
     * @param code the Person to search
     * @return the Person with that id
     */
    public Person select(int id) {
    	Instant start = Instant.now();
    	Person p = this.findByPrimaryKey(id);
    	Instant stop = Instant.now();
    	Duration timeElapsed = Duration.between(start, stop);
    	this.selectTime.add(timeElapsed.toMillis());
    	return p;
    }
    
    /**
     * 
     * @return the minimum time elapsed for a select operation
     */
    public long getMinSelect() {
    	OptionalLong min = selectTime.stream().mapToLong(a->a).min();
    	return min.isPresent()?min.getAsLong():-1;
    }
    
    /**
     * 
     * @return the maximum time elapsed for a select operation
     */
    public long getMaxSelect() {
    	OptionalLong max = selectTime.stream().mapToLong(a->a).max();
    	return max.isPresent()?max.getAsLong():-1;
    }
    
    /**
     * 
     * @return the minimum time elapsed for an insert operation
     */
    public long getMinInsert() {
    	OptionalLong min = insertTime.stream().mapToLong(a->a).min();
    	return min.isPresent()?min.getAsLong():-1;
    }
    
    /**
     * 
     * @return the maximum time elapsed for an insert operation
     */
    public long getMaxInsert() {
    	OptionalLong max = insertTime.stream().mapToLong(a->a).max();
    	return max.isPresent()?max.getAsLong():-1;
    }
    
}

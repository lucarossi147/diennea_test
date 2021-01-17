import java.util.*;

public class Test {

	public static void main(String[] args) {
		Measurer measurer = new Measurer();
		//create 6 people
		Person test1 = new Person("Test1", "Test1", 21);
        Person test2 = new Person("Test2", "Test2", 21);
		Person test3 = new Person("Test3", "Test3", 22);
		Person test4 = new Person("Test4", "Test4", 22);
		Person test5 = new Person("Test5", "Test5", 22);
		Person test6 = new Person("Test6", "Test6", 21);
		//add people to list
		List<Person> people = Arrays.asList(test1, test2, test3, test4, test5, test6);
		//create the measurer
		//insert the first list of people
		//during the insertion every person receive an id
		measurer.measurerInsert(people);
		//reset the id of every person, so that i can simulate to have different ones
		for (Person p : people) {
			p.setId(-1);
		}
		measurer.insert(people);
		//reset the id of every person, so that i can simulate to have different ones
		for (Person p : people) {
			p.setId(-1);
		}
		measurer.insert(people);
		//fetch the first x people
        List<Person> results = new ArrayList<>();
        for (int i=1; i < 50; i++) {
        	results.add(measurer.select(i)); 
        }
        //create map of modifies
        Map<Person, Integer> modifies = new HashMap<>();
        //set the age of every person to 50
        for (Person p : results) {
            if(p!=null){
                modifies.put(p, 50);
            }
        }
        measurer.updateAge(modifies);
        //write out the names of the retrieved people
        for (Person p : results) {
            if(p!=null){
                System.out.println("found "+p.getName());
            }
        }
        
        measurer.delete(Arrays.asList(1,2,4));
        //print out some statistics
        System.out.println("-------- some stats -----------");
        System.out.println("avarage insert time: " + measurer.getAvgInsert());
        System.out.println("min insert time: "+ measurer.getMinInsert());
        System.out.println("max insert time: "+ measurer.getMaxInsert());
        System.out.println("---------------");
        System.out.println("avarage select time: " + measurer.getAvgSelect());
        System.out.println("min select time: "+ measurer.getMinSelect());
        System.out.println("max select time: "+ measurer.getMaxSelect());
	}
}

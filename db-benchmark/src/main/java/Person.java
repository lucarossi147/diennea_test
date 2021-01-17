public class Person {

	private final String name;
	private final String surname;
	private int id;
	private int age;

	/*public Person (final String name, final String surname, final int id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
	}*/
	
	public Person (final int id, final String name, final String surname, final int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = id;
	}
	
	
	public Person (final String name, final String surname, final int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = -1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(final int age) {
		this.age = age;
	}
}

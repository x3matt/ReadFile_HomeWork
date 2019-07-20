import java.time.LocalDate;

public class Person {

	private String name;
	private String surName;
	private LocalDate birthDay;
	public Person(String name, String surName, LocalDate birthDay) {
		super();
		this.name = name;
		this.surName = surName;
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public String getSurName() {
		return surName;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", surName=" + surName + ", birthDay=" + birthDay + "]";
	}
	
	
}

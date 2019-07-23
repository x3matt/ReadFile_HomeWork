import java.time.LocalDate;

public class Person {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (birthDay == null) {
			if (other.birthDay != null)
				return false;
		} else if (!birthDay.equals(other.birthDay))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}
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

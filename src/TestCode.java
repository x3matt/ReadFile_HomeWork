import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestCode {

	@Test
	public void makePersonListTest() throws Exception {
		//Persons.txt
		List<Person> result = Arrays.asList(
		new Person("Ivan","Evglenov",LocalDate.parse("2000-04-21")),
		new Person("Evgeniy","Kurbatov",LocalDate.parse("1998-01-23")),
		new Person("Olga","Ivanova",LocalDate.parse("2001-07-07"))
	);
		List<Person> testv = Main.makePersonList("Persons.txt");
		assertEquals(result, testv);
	}
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws Exception {
		//Persons.txt
		makePersonList("Persons.txt").forEach(System.out::println);
	}
	public static List<Person> makePersonList(String fileName) throws Exception{
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			Stream<String> lines = bufferedReader.lines();
			return lines
					.map(s -> s.split(","))
					.map(s -> new Person(s[0], s[1], LocalDate.parse(s[2])))
					.collect(Collectors.toList());
	}
}
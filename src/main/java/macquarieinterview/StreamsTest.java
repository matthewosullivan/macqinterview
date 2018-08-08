package macquarieinterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Laith", "Mack"));
		list.add(new Person("Yael", "Mack"));
		list.add(new Person("Quamar", "Wallace"));
		list.add(new Person("Jocelyn", "Mack"));
		
		
		List<String> firstNameList = new ArrayList<>();
		
		list.forEach(p -> firstNameList.add(p.getFirstName()));
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Person::getLastName, Collectors.counting()));
		
		Set<Entry<String,Long>> entrySet = collect.entrySet();
		
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}

}


class Person {
	String firstName;
	String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

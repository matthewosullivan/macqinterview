package macquarieinterview;

public class EqualsTestMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		s1.age = 10;
		s1.name = null;
		
		Square s2 = new Square();
		s2.age = 10;
		s2.name = null;
		
		System.out.println(s1.equals(s2));
	}

}

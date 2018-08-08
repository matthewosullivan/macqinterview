package macquarieinterview;

import java.util.Objects;

public class Square {
	String name;
	int age;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Square)) return false;
		
		Square square = (Square)obj;
		return Objects.equals(this.name, square.name) && Objects.equals(this.age, square.age);  
	}
}

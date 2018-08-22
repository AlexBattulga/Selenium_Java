
public class LogicalOperators {

	/*
	 * Three types
	 * &&, ||, !
	 * && - will executes both condition
	 * || = only executes the condition that is true
	 * ! will checks the value is null or not*/
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!(b1 && b2));
	}

}

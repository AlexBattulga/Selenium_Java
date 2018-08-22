public class SimpleDemo {
	String insta = "instance variable";
	static String str = "class or static variable";
	public static void main(String[] args) {
//		SimpleDemo obj = new SimpleDemo();
//		SimpleDemo obj1 = new SimpleDemo();
//		SimpleDemo obj2 = new SimpleDemo();
//		System.out.println(obj.str);
//		System.out.println(obj1.str);
//		System.out.println(obj2.str);
//		obj.str="Changed Text";
//		obj1.str="Changed Text";
//		obj2.str="Changed Text";
//		System.out.println(obj.str);
//		System.out.println(obj1.str);
//		System.out.println(obj2.str);
		SimpleDemo obj = new SimpleDemo();
		System.out.println(obj.insta);
		System.out.println(obj.insta);
		System.out.println(obj.insta);
		obj.insta = "Changed Text instance variable";
		System.out.println(obj.insta);
	}
}

package Continue;

public class FinallyConcept {
	public static void main(String[] args) {
		//test1();
		//test2();
		division();
	}

	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}
		
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("Inside test 2");
		}
		finally {
			System.out.println("finally code in test2 method");
		}
	}
	
	public static void division() {
		int i =10;
		try {
			System.out.println("inside try block");
			int k = i/0;
		}catch(ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("Divide by zero");
		}
		finally {// finally will be called always either you are handling exception or not
			System.out.println("execute this code even after");
		}
		
	}
}

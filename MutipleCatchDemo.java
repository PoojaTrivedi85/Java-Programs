
public class MutipleCatchDemo {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 0, result = 0;
		int a[] = new int [5];
		
		try {
			a[5] = 20;
			
			result = num1/num2;
			System.out.println("Division Result : "+ result);
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Exception thrown: Division by zero!!!");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: Array is out of Bound");
		}
		
		finally {
			
			System.out.println("Finally: Multiple Catch Program Understood.");
		}

	}

}

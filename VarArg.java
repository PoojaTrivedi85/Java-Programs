
public class VarArg {

	public static void main(String[] args)
	{
		System.out.println("Example of overloading and varsgs \n");
		
		display("Hello", "This", "is", "example", "of", "varags");
		
		System.out.println();
		
		System.out.println("Addition of numbers:" +display(10,10));
	}
	static void display(String... values)
	{
		for(String str: values) {
			System.out.println(str);
		}
	}
	static int display(int...values)
	{	
		int total = 0;
		
		for(int value: values) {
			total += value;
		}
		
		return total;
	}
		
	}


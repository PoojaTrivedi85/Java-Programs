
public class Fibonnaci {

	public static void main(String[] args) {
		
		int n = 100, term1 = 0, term2 = 1;
        
        System.out.println("Fibonacci series upto 100");
        while (term1 <= n)
        {
            System.out.print(term1 + " ");

            int sum = term1 + term2;
            term1 = term2;
            term2 = sum;
        }

	}

}



public class EnhancedFor {

	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int x: nums) 
		{
			System.out.println("Num : "+ x);
			sum = sum + x;
			
		}
		
		System.out.println("Addition of numbers 1 to 10: "+sum);
		
	}

}

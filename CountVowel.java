import java.util.*;

public class CountVowel {

	public static void main(String[] args) {
	
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to count number of vowels");
		
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch =='a' || ch =='A' || ch =='e' || ch =='E' || ch =='i' || ch =='I' || ch =='o' || ch =='O' || ch =='u' || ch =='U' ) {
				
				count++;
				
			}
		}
		System.out.println("Count of vowels : "+ count);
		

	}

}

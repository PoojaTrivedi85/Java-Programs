
public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello");
		
		sb.replace(2, 2, "Java");
		
		System.out.println(sb);
		
		StringBuilder builder = new StringBuilder("Welcome");
		
		builder.replace(2, 4, "Pooja");
		
		System.out.println(builder);
	}

}

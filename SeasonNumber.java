import java.util.Scanner;

public class SeasonNumber {

	public static void main(String[] args) {
	
    String season;
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
      switch (num)
        {
            case 12:
            case 1:
            case 2:
            season = "Winter";
            break;
            case 3:
            case 4:
            case 5:
            season = "Spring";
            break;
            case 6:
            case 7:
            case 8:
            season = "Summer";
            break;
            case 9:
            case 10:
            case 11:
            season = "Autumn";
            break;
            default:
            season = "No such month exists";
            break;
       }
        System.out.println("Month " +num+ " : " + season );
   }
}
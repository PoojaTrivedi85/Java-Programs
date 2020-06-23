
import java.util.*;

public class ConstructorDemoCustomerDetails {

    public static void main (String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
    	Customer ob = new Customer();
        
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        ob.setCustomerName(name);
        
        System.out.println("Enter the ContactNumber:");
        long contact = sc.nextLong();
        ob.setContactNumber(contact);
        
        System.out.println("Enter the EmailId:");
        String id = sc.next();
        ob.setEmailId(id);
        
        System.out.println("Age:");
        int age = sc.nextInt();
        ob.setAge(age);
        
        System.out.println("Name:"+ob.getCustomerName());
        
        System.out.println("ContactNumber:"+ob.getContactNumber());
        
        System.out.println("EmailId:"+ob.getEmailId());
        
        System.out.println("Age:"+ob.getAge());
    }
}
public class Customer{
    String customerName;
    long contactNumber;
    String emailId;
    int age;
    
     Customer(){
        
    }
     String getCustomerName(){
        return customerName;
    }
    long getContactNumber(){
        return contactNumber;
    }
    String getEmailId(){
        return emailId;
    }
     int getAge(){
        return age;
    }
     void setCustomerName(String name){
        this.customerName = name;
    }
    void setContactNumber(long contact){
        this.contactNumber = contact;
    }
    void setEmailId(String id){
        this.emailId = id;
    }
     void setAge(int age){
        this.age = age;
    }
}
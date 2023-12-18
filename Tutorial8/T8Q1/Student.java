package T8Q1;

public class Student {
    private String contactNumber;
    
    public Student(){
        contactNumber = null;
    }
    public Student(String value){
        this.contactNumber = value;
    }
    public String getContactNumber(){
        return this.contactNumber;
    }
    public void setContactNumber(String contact){
        this.contactNumber = contact;
    }
    public void display(){
        System.out.println("The contact number is: "+getContactNumber());
    }
}

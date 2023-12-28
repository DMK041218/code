package Lab9.Lab9.L9Q2Q3;

public class PersonProfile {
    private String name;
    private String gender;
    private String dateOfBirth;
    public PersonProfile(String name,String gender,String dateOfBirth){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Date of birth: "+this.dateOfBirth);
    }

}

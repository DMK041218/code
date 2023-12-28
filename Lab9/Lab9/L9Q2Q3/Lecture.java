package Lab9.Lab9.L9Q2Q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lecture extends PersonProfile{
    protected ArrayList<String> courseCode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<Double> originalCr = new ArrayList<>();
    protected ArrayList<Double> updatedCr = new ArrayList<>();
    protected ArrayList<Integer> numOfStudents = new ArrayList<>();

    public Lecture(String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);
    try{
        Scanner s = new Scanner(new FileInputStream(new File("lecturer.txt")));
        while(s.hasNextLine()){
            courseCode.add(s.nextLine());
            courseName.add(s.nextLine());
            session.add(s.nextLine());
            semester.add(s.nextLine());
            double credit = Double.parseDouble(s.nextLine());
            originalCr.add(credit);
            int number = Integer.parseInt(s.nextLine());
            numOfStudents.add(number);
            updatedCr.add(compute(credit, number));
        }
    }
    catch(FileNotFoundException e){
        System.out.println("File was not found");
    }
}

     
    public double compute(Double credit,Integer number){
        if(number>=150){
            return credit*3;
        }
        else if(number>=100){
            return credit*2;
        }
        else if(number>=50){
            return credit*1.5;
        }
        else return credit;
    }
    public void displayAll(){
        super.display();
        System.out.println();
        for(int i = 0;i<courseCode.size();i++){
        System.out.println("Course code: "+courseCode.get(i));
        System.out.println("Couse name: "+courseName.get(i));
        System.out.println("Session: "+session.get(i));
        System.out.println("Semester: "+semester.get(i));
        System.out.println("Original credit: "+originalCr.get(i));
        System.out.println("Updated credit: "+updatedCr.get(i));
        System.out.println("Number of registered students: "+numOfStudents.get(i));
        System.out.println();
        }
    }
}
    

        


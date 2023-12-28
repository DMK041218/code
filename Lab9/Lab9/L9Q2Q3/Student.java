package Lab9.Lab9.L9Q2Q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends PersonProfile {
    protected String fileName;
    protected ArrayList<String> courseCode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<String> grade = new ArrayList<>();
    protected ArrayList<Integer> mark = new ArrayList<>();
    
    public Student(String name,String gender,String dateOfBirth,String fileName){
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
    
    try{
        Scanner s = new Scanner(new FileInputStream(new File("course.txt")));
        while(s.hasNextLine()){
            courseCode.add(s.nextLine());
            courseName.add(s.nextLine());
            session.add(s.nextLine());
            semester.add(s.nextLine());
            
            
            int tempMark = Integer.parseInt(s.nextLine());
            mark.add(tempMark);
            grade.add(calculate(tempMark));
        }
    }
        
    
    catch(FileNotFoundException e){
        System.out.println("Can not found file");
    }
    }
    public String calculate(int tempMark){
        if(tempMark>=85){
            return "A";
        }
        else if(tempMark>=75){
            return "A-";
        }
        else if(tempMark>=70){
            return "B+";
        }
        else if(tempMark>=65){
            return "B";
        }
        else if(tempMark>=60){
            return "B-";
        }
        else if(tempMark>=55){
            return "C+";
        }
        else if(tempMark>=50){
            return "C";
        }
        else if(tempMark>=45){
            return "D";
        }
        else if(tempMark>=35){
            return "E";
        }
        else{
            return "F";
        }
    }    
    public void displayAll(){
        super.display();
        for(int i = 0; i<courseCode.size();i++){
            System.out.println("Course code: "+courseCode.get(i));
            System.out.println("Course name: "+courseName.get(i));
            System.out.println("Session: "+session.get(i));
            System.out.println("Semester: "+semester.get(i));
            System.out.println("Grade: "+grade.get(i));
            System.out.println();
        }
    }
}



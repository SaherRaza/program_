package cgpa_program;

import java.util.ArrayList;
import java.util.Scanner;

public class cgpa {
	static String courseName;
	static String grade="",Cgrade;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int courses;
	double credit1;
	double credit2;
	double credit3;
	double credit4;
	double totalcredits=0;
	double gradeValue=0;
	double gpa;
	
	
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Enter the number of courses:");
	courses=keyboard.nextInt();
	
	   
	ArrayList<String> usercourses = new ArrayList<String>();
	ArrayList<String> usergrades = new ArrayList<String>();
	
	for(int i=0;i<=courses;i++) {
    	System.out.println("Enter Course name:");
    	 String courseName = keyboard.nextLine();
    	 usercourses.add(courseName);
    	 for(int j=1;j<=3;j++){
    		    System.out.println("Enter Grade:");
    		 	String Cgrade=keyboard.nextLine();
    		 	usergrades.add(Cgrade);
    		 	
    		 }
    	 
	}
	if(grade.equals("A"))
		gradeValue=4.0;
	else if(grade.equals("A-"))
		gradeValue=3.87;
	else if(grade.equals("B+"))
		gradeValue=3.33;
	else if(grade.equals("B"))
		gradeValue=3.00;
	else if(grade.equals("B-"))
		gradeValue=2.67;
	else if(grade.equals("C+"))
		gradeValue=2.33;
	else if(grade.equals("C"))
		gradeValue=2.00;
	else if(grade.equals("D+"))
		gradeValue=1.33;	
	else if(grade.equals("D"))
		gradeValue=1.00;
	else if(grade.equals("F"))
		gradeValue=0;
	else 
		System.out.println("Invalid Grade");

}
}

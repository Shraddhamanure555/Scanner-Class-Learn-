package com.scanner;
import java.util.Scanner;
public class StudentResult {
public static void main(String args[]) {
	
//	SCANNER CLASS FOR TAKING INPUT AND IT PRESENT IN java.util.Scnner;
	Scanner sc = new Scanner (System.in);
	
//	TAKING INPUT THE USER NAME 
	System.out.println("Enter the Name: ");
	String Name = sc.nextLine();
	
//	TAKING INPUT THE USER ID
	System.out.println("Enter the ID: ");
	 int PRN =sc.nextInt();
	 
//	TAKING INPUT FROM USER COURSE 
	
//	Taking the input from user passing year 
	System.out.println("Enter the passing year: ");
	int Year = sc.nextInt();
	
	System.out.println("Enter the Course Name: ");
	String Course =sc.next();

	
	System.out.println("Enter the  Your Percentage: ");
	double percentage = sc.nextDouble();
	
	
//	Studentpercent st = new Studentpercent ("Mahi vardhan",24,"AI",2025);
	Studentpercent st = new Studentpercent( Name,PRN,Course, Year,percentage );
	st.stuResult();
//	System.out.println("S="+st);
//	System.out.println(s);
	//st.setResult1();

}
}

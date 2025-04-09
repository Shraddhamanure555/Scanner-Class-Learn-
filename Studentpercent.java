package com.scanner;

public class Studentpercent {
String studentName;
int id;
String branch;
int pYear;

double percentage;
//char grade;

public Studentpercent(String studentName,int id,String branch,int pYear,double percentage) {
	this.studentName = studentName;
	this.id = id;
	this.branch =branch;
	this.pYear = pYear;	
	this.percentage = percentage; 
	System.out.println(stuResult());
}
//public void display() {
//	System.out.println("ENTER THE Name: "+studentName);
//	System.out.println("Enter the PRN: "+id);
//	System.out.println("Enter the branch: "+branch);
//	System.out.println("Enter the passing year: " + pYear);
//	System.out.println("Enter the percentage: " + stuResult());
	//System.out.println("Enter the "+ st.stuResult1());
	
//}
//
public String stuResult(){
	if(percentage < 100 && percentage > 90) {
		return "A";		
	}else if(percentage < 90 && percentage > 80){
		return "B";
	}else if(percentage < 70 && percentage > 60) {
//		System.out.println("Student get the C grade good: "+percentage);
		return "C";
	}else {
		return "Fail";
	}
}

//public void stuResult1(double percentage){
//	if(percentage < 100 && percentage > 90) {
//		System.out.println("Enter the passing year: ");		
//	}else if(percentage < 90 && percentage > 80){
//		System.out.println("Enter the passing year: ");
//	}else if(percentage < 70 && percentage > 60) {
//		System.out.println("Student get the C grade good: ");
////		return "C";
//	}else {
//		System.out.println("Student get the C grade good: ");	}
//}
//@Override
//public String toString() {
//	return "StudentDetails: [studentName=" + studentName + ", id=" + id + ", branch=" + branch + "+ pYear=" + pYear + "]";
//}


}

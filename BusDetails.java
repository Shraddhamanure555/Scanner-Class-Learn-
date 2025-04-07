package com.scanner;
import java.util.Scanner;
public class BusDetails {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the bus number: ");
	
	int a =sc.nextInt();
	Bus bs = new Bus();
	bs.myBus(a);
	
	
	
	
}
}

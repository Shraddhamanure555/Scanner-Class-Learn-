package com.scanner;

import java.util.Scanner;

public class Evencall {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the Number: ");
		 int num = sc.nextInt();
		 EvenOdd ev = new EvenOdd();
		 ev.evenOdd(num);
//		 ev.evenOdd(sc);
}
}

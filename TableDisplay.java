package com.scanner;
import java.util.Scanner;
public class TableDisplay {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number you want to print table:  ");

int num = sc.nextInt();
Table te = new Table();
te.printTable(num);
System.out.println(te);
	}
}
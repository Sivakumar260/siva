package welcome;

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Arithmeticcalculator {
	 public static void main(String[] args) {
		  
		  int num1, num2;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Eneter the first number: ");
		  num1=sc.nextInt();
		  
		  System.out.println("Eneter the second number: ");
		  num2=sc.nextInt();
		  
		  System.out.println("Eneter the operator: ");
		  char op = sc.next().charAt(0);
		  
	      double o = 0;
	  
	      switch (op) {
	 
	           case '+':
	                o = num1 + num2;	  
	                break;	        
	           case '-':
	                o = num1 - num2;
	                break;	        
	           case '*':	  
	                o = num1 * num2;	  
	                break;
	           case '/':
	                o = num1 / num2;
	                break;
	           default:	  
	                System.out.println("You enter wrong input");
	                break;
	        }
	  
	        System.out.println("The final result:"+ o);
	 }
}

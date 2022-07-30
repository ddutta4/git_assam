package com.tcs;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, p;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no :");
		n= sc.nextInt();
		System.out.println("Enter the Second no :");
		p=sc.nextInt();
		System.out.println("Enter the operator :" + '+' + '-' + '/' + '*');
		operator = sc.next().charAt(0);
		switch(operator) {
		
		case '+': {System.out.println(n+p); break;}
		case '-': {System.out.println(n-p);break;}
		case '/': {System.out.println(n/p);break;}
		case '*': {System.out.println(n*p);break;}
		default : {System.out.println("Invalid option");}
		
		
		}
		

	}

}

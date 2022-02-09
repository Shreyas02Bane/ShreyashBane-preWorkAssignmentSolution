package com.preWorkAssignments;

import java.util.Scanner;

public class PreWorkAssignment1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Tasks t = new Tasks();
		int i = 0;
		do {
			System.out.println("Enter the number of corresponding Action to be performed: (You can enter any other digit to exit program)");
			System.out.println("1. Check for palindrome number");
			System.out.println("2. Prints the pattern of stars in decreasing order based on the input");
			System.out.println("3. Check whether the input number is a prime number");
			System.out.println("4. Print Fibonacci series of size n with first two numbers as 0, 1");
			i=sc.nextInt();
			switch(i) {
			case 1: System.out.println("Enter the number to check for Palindrome: ");
				int num = sc.nextInt();
				t.Palindrome(num);
				break;
			
			case 2: System.out.println("Enter the number to print Pattern: ");
				int num1 = sc.nextInt();
				t.Pattern(num1);
				break;
			
			case 3: System.out.println("Enter the number to check for Prime: ");
				int num2 = sc.nextInt();
				t.isPrime(num2);
				break;
				
			case 4: System.out.println("Enter the number to print Fibonacci Series: ");
				int num3 = sc.nextInt();
				t.Fibonacci(num3);
				break;
			
			default: System.out.println("Thank You for using the Program");
			}
			System.out.println();
			System.out.println("==========================================================================");
			System.out.println();			
		}while(i<5 && i>0);
	}
}


class Tasks {
	public void Palindrome(int num) {
		int no_ = num;
		int r,sum=0,temp;
		temp=no_;
		while(no_>0) {
			r= no_%10;
			sum = (sum*10)+r;
			no_ = no_/10;
		}
		if(temp == sum) {
			System.out.println("The number "+temp+" is Palindrome");
		}else {
			System.out.println("The number "+temp+" is not Palindrome");
		}
	}
	
	public void Pattern(int num) {
		int dig = num;
		System.out.println("The Pattern is: ");
		for(int i = dig; i>0; i--) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void isPrime(int num) {
		int n= num, count=0;
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("The number "+n+" is Prime");
		}else
			System.out.println("The number "+n+" is not Prime");
	}
	
	public void Fibonacci(int num) {
		int a=0,b=1,sum=0;
		int count = num;
		System.out.println("The Fibonacci Series is: ");
		System.out.print(a);
		for(int i=1; i<count; i++) {
			sum = a+b;
			System.out.print(","+b);
			a = b;
			b=sum;
		}
		System.out.println();
	}
}
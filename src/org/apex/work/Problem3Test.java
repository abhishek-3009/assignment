package org.apex.work;

import java.util.Scanner;

public class Problem3Test {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		Problem3 pro=new Problem3();
		scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=scanner.nextInt();
		System.out.println("Enter number 2");
		int b= scanner.nextInt();
		System.out.println("The sum is:"+ pro.sum(a, b));
		System.out.println("The subtraction is:"+ pro.subtraction(a, b));
		System.out.println("The multiplication is:"+ pro.multiplication(a, b));
		System.out.println("The division is:"+ pro.division(a, b));

	}

}

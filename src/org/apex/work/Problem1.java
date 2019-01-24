package org.apex.work;

import java.util.Scanner;

public class Problem1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int a,i=0,first=0,second=1,sum=0;
		System.out.println("Enter Series Length");
		a= scanner.nextInt();
		System.out.println(first);
		System.out.println(second);
		while (i<a) {
			sum= first+second;
			System.out.println(sum);
			first=second;
			second=sum;
			i++;
		}
		
	}

}

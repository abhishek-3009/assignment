package org.apex.work;

public class Problem4Test {

	public static void main(String[] args) {
		Problem4 pro=new Problem4();
		System.out.println("Is 10 an Integer: "+pro.IsInteger("10"));
		System.out.println("Is 10.4 an Integer: "+pro.IsInteger("10.4"));
		System.out.println("Is 10 an Even: "+pro.IsEvenNumber("10"));
		System.out.println("Is 7 an Even: "+pro.IsEvenNumber("7"));
		System.out.println("Is 7 an Odd: "+pro.IsOddNumber("7"));
		System.out.println("Is 10 an Odd: "+pro.IsOddNumber("10"));
		System.out.println("Is 7 a Prime: "+pro.IsPrimeNumber("7"));
		System.out.println("Is 10 a Prime: "+pro.IsPrimeNumber("10"));

	}

}

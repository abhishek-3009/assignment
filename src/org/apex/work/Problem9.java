package org.apex.work;

public class Problem9 {

	public static void main(String[] args) {

		StringBuilder strBuilder= new StringBuilder("This is me helooooooo and you are you");
		System.out.println(strBuilder);
		System.out.println(strBuilder.capacity()+"\t"+strBuilder.length());
		strBuilder.append("\nIs this Me? or is this you?");
		System.out.println(strBuilder);
		System.out.println(strBuilder.capacity()+"\t"+strBuilder.length());
		
		StringBuffer strBuffer= new StringBuffer("This is Me helooooooo and you are you");
		System.out.println(strBuffer);
		System.out.println(strBuffer.capacity()+"\t"+strBuffer.length());
		strBuffer.append("\nIs this Me? or is this you?");
		System.out.println(strBuffer);
		System.out.println(strBuffer.capacity()+"\t"+strBuffer.length());
	}

}

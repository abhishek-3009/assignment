package org.apex.work;

public class Problem9 {

	public static void main(String[] args) {

		StringBuilder strBuilder= new StringBuilder();
		int i=97;
		System.out.println(strBuilder.capacity()+"\t"+strBuilder.length());
		while( i <= 122) {
			strBuilder.append((char)i);
			i++;	
		}
		System.out.println(strBuilder);
		System.out.println(strBuilder.capacity()+"\t"+strBuilder.length());
		
		StringBuffer strBuffer= new StringBuffer();
		System.out.println(strBuffer.capacity()+"\t"+strBuffer.length());
		for(i= 97; i < 123; i++) {
			strBuffer.append((char)i);
		}
		System.out.println(strBuffer);
		System.out.println(strBuffer.capacity()+"\t"+strBuffer.length());
	}

}

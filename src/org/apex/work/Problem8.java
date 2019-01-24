package org.apex.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem8 {

	public static void main(String[] args) throws IOException {

		StringBuilder sb= new StringBuilder();
		BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Erik\\Desktop\\JAVA\\test.txt"));
		System.out.println(sb);
		System.out.println(br);
		String line;
		while((line= br.readLine()) != null) {
			sb.append(line).append("\n");
		}
		br.close();
		String str= sb.toString();
		System.out.println(str);
		int len= str.length();
		int count=0;
		for(int i=0; i< len;i++) {
			if(str.toLowerCase().charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("Number of a: "+count);
	
	}
}

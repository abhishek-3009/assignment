package org.apex.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem10 {

	public static void main(String[] args) throws IOException {
	//	try {
			
			BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Erik\\Desktop\\JAVA\\states.txt"));
			StringBuilder sb = new StringBuilder();
			String line;
			while((line=br.readLine())!=null) {
				sb.append(line).append("\n");
			}
		//	String state= sb.toString();
			String[] str= sb.toString().split("\n");
			br.close();
			
			ArrayList<String> stateNames= new ArrayList<String>();
			for(String i : str) {
				stateNames.add(i);
				
			}	
			System.out.println(stateNames);
			System.out.println(stateNames.size());
	//	}
		
	}
}

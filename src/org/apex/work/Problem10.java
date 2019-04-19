package org.apex.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.TreeSet;

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
		//	Iterator<String> iterator= stateNames.iterator();
		//	while(iterator.hasNext()) {
		//		System.out.println(iterator.next());
		//	}
			System.out.println("ArrayList: "+stateNames);
			System.out.println(stateNames.size());
			
			HashSet<String> hshSet= new HashSet<String>();
			hshSet.addAll(stateNames);
			System.out.println("HashSet: "+hshSet);
			
			TreeSet<String> treeSet= new TreeSet<String>();
			treeSet.addAll(stateNames);
			System.out.println("TreeSet: "+treeSet);
			
	//	}
		
	}
}

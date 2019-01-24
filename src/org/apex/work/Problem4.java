package org.apex.work;

public class Problem4 {

	public Boolean IsInteger(String str) {
		float num = Float.parseFloat(str);
		int rem;
		num*=10;
		rem=(int)num%10;
		if (rem==0) {
			return true;
		}else
			return false;
		
	}	
	
	public Boolean IsOddNumber(String str) {
		if (Integer.parseInt(str) % 2 != 0) {
			return true;
		}else
			return false;
	}
	public Boolean IsEvenNumber(String str) {
		if (Integer.parseInt(str) % 2 == 0) {
			return true;
		}else
			return false;
	}
	public Boolean IsPrimeNumber(String str) {

		int num=Integer.parseInt(str);
		int count=0;
		if (num==1) {
			return false;
		}else {

			for(int i=1;i<=num;i++) {
				if (num% i==0) {
					count++;
				}
			}
		}
		if (count ==2) {
			return true;
		}else
			return false;
	}

}

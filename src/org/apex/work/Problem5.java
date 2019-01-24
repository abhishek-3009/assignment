package org.apex.work;

public class Problem5 {

	public int a;
	public Problem5() {
		a=1;
	}
	public Problem5(int a) {
		this.a=a;
	}
	public void oddNumberGen() {
		for (int i=1;i<=1000;i++) {
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
	}

	public void numberGen() {
		for (int i=1;i<=1000;i++) {
			if(i % a ==0) {
				System.out.println(i);
			}
		}
	}

}

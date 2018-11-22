package com.dmodi;
public class TestService {
	public int getUniqueId() {
		return 43;
	}
	
	public int testing(int num) {
		someMethod("Process");
		return num;
	}
	
	public void someMethod(String m) {
		//System.out.println("Processing This Parameter: "+m);
		System.out.println("");
	}
	public static void main(String[] args) {
		new TestService().testing(1);
	}
}
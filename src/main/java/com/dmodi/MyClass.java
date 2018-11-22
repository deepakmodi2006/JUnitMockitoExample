package com.dmodi;
class MyClass {
	public int multiply(int i, int j) {
		if (j > 999) {
			throw new IllegalArgumentException("Second Parameter should be less than 1000");
		}
		return i *j;
	}
}
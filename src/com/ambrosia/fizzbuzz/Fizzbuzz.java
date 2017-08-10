package com.ambrosia.fizzbuzz;

public class Fizzbuzz {

	public static void main(String[] args) {

		for (int x = 0; x <= 100; x++) {
			
			if(x % 15 == 0) {
				System.out.println("fizzbuzz");
				
			} else if(x % 5 == 0) {
				System.out.println("buzz");
				
			} else if(x % 3 == 0) {
				System.out.println("fizz");
			}
			
			System.out.println(x);
		}
	}
}
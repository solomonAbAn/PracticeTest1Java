package PracticeTest3;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Write a program to find the largest among three numbers using nested if-else.
		
		
		//find
		//largest
		//among three numbers
		//nested if -else
		
		
		
		//the numbers
		Random rd = new Random();
		
		
		int a = rd.nextInt(10);
		int b = rd.nextInt(10);
		int c = rd.nextInt(10);
		System.out.println("the numbers are: " + a + " " + b + " " + c);
		
		//largest: a>b>c
		
		if (a>b) {
			if (a>c) {
				System.out.println(a + " is the largest");
			}else {
				System.out.println(c + " is the largest");
			}
		}
		else {
			if(b>c) {
				System.out.println(b + " is the largest");
			}
			else {
				System.out.println(c + " is the largest");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

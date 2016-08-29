package pratllad;

import java.util.Scanner;

public class A11ReadinputfrmConsole {
	public static void main(String[] args){		
//		System.out.println("Whats happening guys");
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age = input.nextInt();
		System.out.println(age);
		System.out.println("OK your age is "+age);
		System.out.println("Enter your average ");
		double average = input.nextDouble();
		System.out.println("OK your average is "+average);
		
		input.close();
		
		
		
	}
}

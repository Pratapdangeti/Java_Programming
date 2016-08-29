package pratllad;

import java.util.Scanner;

public class A28UserInputforArray {
	
	public static void main(String[] args){
		int length;
		System.out.println("How many friends name you are gonaa enter");
		Scanner input = new Scanner(System.in);	
		length = input.nextInt();
		String[] names = new String[length];
		
		for(int counter = 0;counter<length;counter++){
			System.out.println("Enter the name of friend "+(counter+1));
			names[counter] = input.next();
		}
		input.close();
		System.out.println("Your friends are");
		for(int counter = 0;counter<length;counter++){
			System.out.println(names[counter]);
			
		}

		
		
	}

}

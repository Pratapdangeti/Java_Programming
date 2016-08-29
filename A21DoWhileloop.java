package pratllad;

import java.util.Scanner;

public class A21DoWhileloop {
	
	public static void main(String[] args){
		
//		int counter = 1;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("1 C Programming");
			System.out.println("2 C++ Programming");
			System.out.println("3 Java Programming");
			System.out.println("enter yes to see this menu again");
			
			
//			System.out.print(counter+" ");
//			System.out.println("Learning lad rocks !");
//			counter++;
			
		}while(input.nextLine().contentEquals("yes"));
		input.close();
	
		
	}
}

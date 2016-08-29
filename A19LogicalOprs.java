package pratllad;

public class A19LogicalOprs {
	
	public static void  main(String[] args){
		
		boolean human = false;
		if(!human){
			System.out.println("Am a human");
		}else{
			System.out.println("Am not a human");
		}
		
		int number=6;
		if ( (number % 2 == 0) && (number %3 ==0) ){
			System.out.println(number + " is completely divisible by both 2 and 3");
			
		}else {
			System.out.println(number + " is not completely divisible by both 2 and 3");
		}

		if ( (number % 2 == 0) || (number %3 ==0) ){
			System.out.println(number + " is completely divisible by  2 or 3");
			
		}else {
			System.out.println(number + " is not completely divisible by both 2 or 3");
		}
		

		if ( (number % 2 == 0) ^ (number %3 ==0) ){
			System.out.println(number + " is completely divisible by  2 or 3 but not the both");
			
		}


		
	}
}

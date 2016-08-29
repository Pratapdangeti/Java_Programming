package pratllad;

public class A23Breakstmt {
	public static void main(String[] args){
		
		int counter,counterouter=1;
		while(counterouter<=10){
		counter = 1;
		while(counter<=10){
			System.out.println(counter);
			if (counter == 5){
				break;
			}			
			counter++;
		}
		counterouter++;

       }
		System.out.println("anything");

	}
}

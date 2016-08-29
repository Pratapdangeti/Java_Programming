package pratllad;

public class A24Continuestmt {
	public static void main(String[] args){
		
		for(int counter=1;counter <= 10;counter++){
			if(counter==5){
				continue;
			}			
			System.out.println(counter+" LearningLad Rocks");	
		}	
		
		System.out.println("From the for loop");
		
		int counter2 = 1;
		while(counter2 <=10){
			if(counter2==5){
				counter2++;
				continue;
			}
			System.out.println(counter2+" LearningLad Rocks");
			counter2++;
		}
		
		
		
	}	
}

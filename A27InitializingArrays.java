package pratllad;

public class A27InitializingArrays {
	
	public static void main(String[] args){
		
//		int marks[] = new int[6];
		
		int marks[] = {44,55,88,99,66,44};
		int totalmarks = 0;
		
		for(int counter = 0;counter<marks.length;counter++){
			totalmarks +=marks[counter]; 
		}
		System.out.println("Total marks is "+totalmarks);
		
		
	}
}

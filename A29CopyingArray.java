package pratllad;

public class A29CopyingArray {
	public static void main(String[] args){
		
		int marks[] = {22,44,55,99,88};
		int markscopy[] = new int[5];
		
//		
//		for(int counter = 0;counter<marks.length;counter++){
//			markscopy[counter]=marks[counter];
//			
//		}
//		
		System.arraycopy(marks,1, markscopy, 1,marks.length-1);
//		marks[2]=200;
		for(int counter = 0;counter<marks.length;counter++){
			System.out.println(marks[counter]);
			
		}		
		for(int counter = 0;counter<markscopy.length;counter++){
			System.out.println(markscopy[counter]);
			
		}		
		
		
	}
}

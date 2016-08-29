package pratllad;

public class A17NestedIfElse {
	public static void main(String[] args){
		int chocolate=1;
		boolean money = false;
		
		if(chocolate==1){
			System.out.println("One Chocolate");
			System.out.println("am gonna eat it");
			if(money){
				System.out.println("am gonna buy more chocolates");				
			}else{
				System.out.println("no money bad luck");
			}
			
		}else if (chocolate==2){
			System.out.println("Two Chocolates");
			System.out.println("am gonna eat one & give one to my gf");
		}else if (chocolate==3){
			System.out.println("Three Chocolates");
			System.out.println("am gonna eat one & give one to my gf & my best friend");
		}else {
			System.out.println("more than Three Chocolates");
			System.out.println("am gonna share it with all my friends");
		}
		
	}
}

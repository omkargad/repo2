package factorial;

public class Newfact {
	
	int i;

	public Newfact(int i) {
		this.i = i;
	}
	
	public Newfact(){
		i=0;
	}
	
	public static void calc(int i){
		
		int num;
		
		int result=1;
		
		for(num=i;i>0;i--){
			result =result*i;
		}

		System.out.println("factorial is" +result);
	}

}

package factorial;

public class Fact {

	public static void main(String[] args) {
		int i;
		int fac=5;
		int result=1;
		
		for(i=1;i<=fac;i++){
			result =result*i;
		}

		System.out.println("factorial is" +result);
	}

}

package common;

public class BooleanExample {
	public static void main(String[] args) {
		boolean trueOrFalse = true; //true
		int var1 = 10;
		trueOrFalse = var1 >15;
	
		for (int i = 0; i<0 ; i++) {
			
			trueOrFalse = var1++ >15;
			if (trueOrFalse)
				System.out.println(var1 + "=>참");
			else
				System.out.println(var1 + "=>거짓");
		}
	System.out.println("end of program");
	}
	
}

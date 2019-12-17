package common;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 020;
		int var3 = 0x5;
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var2:" + var3);
	
		for (int i=0;i<15;i++) {
			System.out.printf("%2X",var3++);
			
		}
		
	}
}

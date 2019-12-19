package Operators;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=2; m<=9;m++) {
			System.out.println(" ");
			for (int n=1; n<10; n++) {
				System.out.print(n+"x"+m+"="+(n*m)+" ");
			}
		}
	}
}

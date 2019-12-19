package Operators;

public class FForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<=100; i++) { //i+2는 왜 못넣어
			if(i%2 ==1)
				sum +=i;
		}
		System.out.println("1~100합 :"+sum);
	
		sum = 0;
		for (int i = 1; i <=100; i+=2) {
			sum +=i;
		}
		System.out.println("1에서 100까지홀수2"+sum);
	}	
}

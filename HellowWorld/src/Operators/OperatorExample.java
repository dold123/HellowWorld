package Operators;

public class OperatorExample {
	public static void main(String[] args) {
		int result = 0;
		int a = 10, b = 20;
		//result = a+b;
		//System.out.println("결과값은 " + result);
		
		sum(10,20); //int 값 필요  //왜 변수선언을 위해했지
		multi(10,20);
 	}
	public static void sum(int a , int b) {  //단순히 다른점은 변수값을 미리 정해주는건가?
						//이거자체로 메소드인가?	//어차피 result에 a+b를 사용한다면 sum 메소드를 사용하는 이유가뭐지
		
		
		int result = a+b;
		System.out.println("method 결과값은 :" + result);
		
	}
	public static void multi(int a, int b) {
		int result = a*b;
		System.out.println("결과값은"+result);
		
	}
}

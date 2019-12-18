package Operators;

public class CheckOverFlowExample {
	public static void main(String[] args) {
		try	{
			int result = safeAdd(2000000000,2000000000); //add값이 int의 범위를 벗어나면 오버플로발생 출력
			System.out.println(result);;
	}catch (ArithmeticException e) { //catch가 뭐임
		System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없다");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE -right)) {
				throw new ArithmeticException("오버플로 발생"); //if값을 만족한다면 throw new(값) -값을 던져라
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로 증가"); // if then 을쓰면안되나?
			}
		}
		return left +right;
	}
}
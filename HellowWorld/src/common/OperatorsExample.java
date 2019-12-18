package common;

public class OperatorsExample {
	public static void main(String[] args) {
	byte var1 = 100;
	byte var2 = 50;
	
	int result = var1+var2;
	
	
	float f1 = 10.1f;
	double f2 = 5.5f;
	double f3 = f1+f2; //byte가 큰 기준으로 형변환 해준다 
						//단 long 과 ㅣfloat을 연산했을때는 float 기준으로 연산한다.
		

	System.out.println("두수의 합은"+" "+result+"입니다.");
	double result1 = 3.14 + 5.0;
	result1 = (int)3.14+5;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

package Operators;

import java.io.IOException;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) { //while(조건) run은 계속 반복해라
			if(keyCode!=13 && keyCode!= 10) {
				System.out.println("-----------------------");
				System.out.println("1.중속||2.감속||3.중직");
				System.out.println("-----------------------");
				System.out.println("서택:");
			}
			keyCode = System.in.read(); //입력값을 입력해라
			
			if (keyCode == 49) {//1을 읽었을 경우
				speed++;
				System.out.println("현재속도="+speed);
			}else if (keyCode == 50) {//3을 읽었을 경우
				speed--;
				System.out.println("현재속도="+speed);
			}else if(keyCode ==51) {//3을 읽었을 경우
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

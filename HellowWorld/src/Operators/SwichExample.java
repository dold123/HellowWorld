package Operators;

public class SwichExample {
	public static void main(String[] args) {
		int score = 90;

		switch (score/10) {
		case 9: //if 문 같이 크다작다를 설정할 수 없다. 90인가 80인가 9인가8인가7인가 등 정확한 숫자를 검색
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
			break; //이조건을 만족하면 바로 빠져나오자
		case 80:
			System.out.println("점수가 85보다 큽니다");
			System.out.println("등급은 B+입니다");
		case 70:
			System.out.println("점수가 85보다 작습니다");
			System.out.println("등급은 C입니다");
		default:
			System.out.println("70보다 큽습니다");
			System.out.println("등급은 D입니다");
		}
	}
}


package Operators;

public class IfExample {
	public static void main(String[] args) {
		int score = 86;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		} else if (score >= 80) {
			if(score >85) {
			System.out.println("점수가 85보다 큽니다");
			System.out.println("등급은 B+입니다");
			}else if (score<85) {
				System.out.println("점수가 85보다 작습니다");
				System.out.println("등급은 C입니다");
			}
		} else if (score >= 70) {
			System.out.println("70보다 큽습니다");
			System.out.println("등급은 D입니다");
		} else {
			System.out.println("70보다 작습니다");

		}
	}
//		if(score<90) {
	// System.out.println("점수가 90보다 작습니다");
	// System.out.println("등급은 B입니다");
}
// }

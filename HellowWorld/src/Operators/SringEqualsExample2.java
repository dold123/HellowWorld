package Operators;

public class SringEqualsExample2 {
	public static void main(String[] args) {
		int score = 85;
		char grade;
		grade = (score >90) ? 'A' : ((score>80) ? 'B' : 'C');
//		if (score>90)
//			grade = 'A';
//		else
//			if (score>80)
//				grade = 'B';
//			else
//				grade = 'C';
//			
		System.out.println(grade);
	}
}

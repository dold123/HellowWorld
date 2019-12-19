package Operators;

public class Conditional10perationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score>80)? 'B':(score>70)?'C':'D');
		System.out.println(grade);
	}
}

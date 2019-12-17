package common; //common 패키지 안에 class가 종속된다. 핼로우클래스는 common.hello 이다.

/*
 * hello 프로그램 ver 0.1
 * 작성자 이창호
 * 생성일 : 2019.12.17
 */
public class Hello {  //클래스 클래스는 여러개가 가능하다. 클래스는 패키지명.class로 지정된다. 
	public static void main(String[] args) {
		//hello class의 처음 실행되는 프로그램
		String str2 = "내나이는";
		int age = 100;
		String str = "살 입니다";
		int maxSpeed = 100;
		byte loveNoltage = 10;
		String thisIsMyFavoritColor = "blue";
		char age2 = 19;
		
		System.out.println(str2+age2+ str);
		
		}
}

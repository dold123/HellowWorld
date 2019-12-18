package Operators;
class	Student{
	int age;
	String name;
	
}
public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";  //str1 에 신민철을 넣는게아니라 신민철이 가지고있는 주소값을 읽어오는거다.
		int num1 = 10;		//num1에는 숫지 10이 들어가이싿.
		//int num2 = 20;		//num1 과 num2는 바로 값을 비교한다.
		String str2 = "신민철";
		String str3 = new String ("신민철");
	
		Student stu1 = new Student();
		System.out.println(stu1);
//		System.out.println(str1==str2);
//		System.out.println(str2==str3);  //str 1과 2는 같은주소를 가지기때문에 같은값이지만
//										//new string은 다른주소에 새로 값을 생성산다
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
		
		if (str1.contentEquals(str3)) { //클래스를 비교할 경우 equals 사용
			System.out.println("같은 내용입니다.");
		}else {
			System.out.println("다른 내용입니다");
		}
//		int var1 = 10;
//		int var2 = 20;
//		int var3 = 30;
//		
//		if (++var1>1 || ++var2 > 30) {
//			System.out.println(var1 + "=====" + var2);
//		}
//		System.out.println(var1 + ", " + var2);
//	}	
		int var1 = 10;
		int result = var1<<1;
		
	
	}
}

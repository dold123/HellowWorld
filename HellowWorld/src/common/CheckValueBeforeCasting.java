package common;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		System.out.println(Byte.MAX_VALUE);			//byte는 변수 Byte는 클래스다
		System.out.println(Byte.MIN_VALUE); //범위를 벗어나는지 안하는지 확인하는구문이다.
		
		if (i>Byte.MAX_VALUE || i<Byte.MIN_VALUE){
			System.out.println("byte타입으로 변환 불가");
		}else {
			byte b = (byte) i;
			System.out.println(b);
		//byte b = (byte)i; //128은 byte단위의 범위를 벗어난다
		}			
		
	}
}

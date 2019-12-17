package common;

public class GarbageValueExample {
	public static void main(String[] args) {
		int var1 = 125;//변수선언 max2,123,483,647
		byte var2= 125; //max 127
									//i-- => i=i-1;
		for (int i =0; i<10 ;i--) //i가 0부터 시작해서 10이 되기전까지 1씩 증가한다(10번반복 구문)
			{var1 = var1 + i;
			var2 = (byte) (var2 + i);//int -> byte 형변환(casting)  //최대값 127을 넘으면 -128부터 다시 시작한다
			System.out.println("var1 :  "+ var1 + ","+"var2:"+var2); 
		//println = 매소드(출력문)
			}
			
	}
	
}


//for (선언;조건 ; 식)
//	{반복 수행할 식}
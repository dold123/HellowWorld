package common;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var3 = (float)3.14;
		//float var33 = 3.1; 실행안됨
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1: "+ var1);
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		System.out.println("var5: "+ var5);
		
		int var6 = 3000000;
		double var7 = 3e6; //앞으로 6칸e 뒤는 자리수르 말한다. e+양수는 양의자리수, e-음수는 뒤로가는 자리수
		float var8 = 3e6f;
		double var9 = 2e-3;//뒤로세칸
		System.out.println("var6: "+ var6);
		System.out.println("var7: "+ var7);
		System.out.println("var8: "+ var8);
		System.out.println("var9: "+ var9);
	
		
		
	}

}

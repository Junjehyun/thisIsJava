package ch02.sec02;

public class ByteExample {

	// byte 타입 변수에 허용 범위를 초과한 값을 대입했을 경우 컴파일 오류가 
	// 발생하는 것을 보여준다.
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128; // 컴파일 에러가뜸. 
		// byte타입의 저장되는 값의 허용범위는 -128~127이다!
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);

	}

}

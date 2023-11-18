package ch02.sec02;

public class LongExample {

	// Long타입은 수치가 큰 데이터를 다루는 프로그램에서 사용된다. 예를 들어 
	// 은행이나 과학분야에서 사용되는 프로그램들이다. 기본적으로 컴파일러는 정수
	// 리터럴을 int 타입 값으로 간주하기 때문에 int 타입의 허용범위 
	// (-2,147,483,648~2,147,483,647)을 초과하는 리터럴은 뒤에 소문자
	// l이나 대문자 L을 붙여 long타입 값임을 컴파일러에게 알려줘야 함.
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; 
		// 컴파일러는 int로 간주하기 때문에 에러발생
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);
	}

}

package ch02.sec03;

public class CharExample {

	// 하나의 문자를 작은따옴표(')로 감싼 것을 문자 리터럴이라고 한다.
	// 문자 리터럴은 유니코드로 변환되어 저장되는데, 유니코드는 세계 각국의 문자를
	// 0~65535 숫자로 매핑한 국제 표준 규약이다. 자바는 이러한 유니코드를 저장할
	// 수 있도록 char 타입을 제공한다.
	public static void main(String[] args) {
		char c1 = 'A'; // 문자 저장
		char c2 = 65; // 유니코드 직접 저장
		
		char c3 = '가'; //문자 저장
		char c4 = 44032; //유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		// char타입 변수에 어떤 문자도 대입하지 않고 단순히 초기화를 할 목적으로
		// 다음과 같이 작은 따옴표 (')를 두개 연달아 붙인 빈 문자를 대입하면 
		// 컴파일 에러가 발생한다. 이 경우는 공백(유니코드:32) 하나를 포함해서
		// 초기화 해줘야됨. 즉, 스페이스바 공백 하나 주라는 말 
		
		//char c = ''; // 컴파일에러
		char c = ' '; // 공백 하나를 포함해서 초기화!
		
	}

}

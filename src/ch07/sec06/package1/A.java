package ch07.sec06.package1;
// protected는 같은 패키지에서는 default처럼 접근이 가능하나, 다른 패키지에서는 자식 클래스만 접근을 허용한다.
// protected는 필드와 생성자 그리고 메소드 선언에 사용가능.
public class A {
	//필드 선언
	protected String field;
	
	// 생성자 선언
	protected A() {
		
	}
	
	// 메소드 선언
	protected void method() {
		
	}
}

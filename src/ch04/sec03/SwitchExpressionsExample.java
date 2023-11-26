package ch04.sec03;

// Java12부터는 switch 문에서 표현식을 사용할 수 있다. break 문을 없애는 대신에 화살표와
// 중괄호를 사용해 가독성이 좋아졌다. 
public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A','a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B','b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
	}
		// 중괄호에 실행문에 하나만 있을 경우에는 중괄호를 생략할 수 있다.
		switch(grade) {
		case 'A','a' -> System.out.println("우수 회원입니다.");
		case 'B','b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}
	}

}

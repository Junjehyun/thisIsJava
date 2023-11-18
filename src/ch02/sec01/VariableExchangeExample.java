package ch02.sec01;

// 이번 예제는 두 변수의 값을 교환하는 방법을 보여준다. 두 변수의 값을 교환하기 위해서
// 새로운 변수 temp를 선언한 것에 주목하길 바란다.
public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x; // 변수 x값 3을 변수 temp에 대입함.
		x = y; // 변수 y값 5를 변수 x에 대입
		y = temp; // 변수 temp값 3을 변수 y에 대입
		System.out.println("x:" + x + ", y:" + y);
		
	}

}

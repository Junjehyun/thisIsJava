package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		
		int hour = 3; // hour 변수 3선언
		int minute = 5; // minute 변수 5선언
		System.out.println(hour + "시간 " + minute + "분");
		// 결과물 3시간 5분 
		
		// hour 변수에서 60곱하고 + minute 변수 선언
		// 그럼 3 * 60 = 180 + 5 = 185가 나온다.
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		// 결과물 총 185분
		
		// 변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다.
		// 다음 코드는 변수 x 값을 변수 y 값으로 복사한다.
		int x = 10; // 변수 x에 10을 대입
		int y = x; // 변수 y에 x 값을 대입 고로 y는 10
	}

}

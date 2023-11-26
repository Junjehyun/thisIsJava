package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// 81이상 100이하의 랜덤한 정수를 생성하여 score 변수에 저장 
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("점수" + score);
		
		// 학점을 저장하는 문자열 변수 
		String grade;
		
		// 첫 번째 if 문 : 점수가 90 이상인 경우
		if(score >=90) {
			// 내부 if 문 : 점수가 95이상인 경우 A+ 그 외에는 A
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			// 두 번째 if 문: 점수가 90 미만인 경우
            // 내부 if 문: 점수가 85 이상인 경우 "B+", 그 외에는 "B" 
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		// 최종 학점 출력
		System.out.println("학점: " + grade);
	}

}

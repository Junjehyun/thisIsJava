package ch04.sec04;
// 중첩된 for문
public class MultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) { //2단부터 9단까지 반복
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) { //각 단의 1부터 9까지 반복
				System.out.println(m + " x " + n + " = " + (m*n)); //구구단 계산 및 출력
			}
		}
	}

}

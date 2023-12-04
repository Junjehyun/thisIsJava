package ch05.sec05;

public class SubStringExample {
// 문자열의 특정 위치의 문자열을 잘라내어 가지고 오고 싶다면 substring() 메서드를 사용.
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
	}

}

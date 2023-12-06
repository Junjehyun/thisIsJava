package ch05.sec09;

public class ArrayCopyByForExample {
// 배열은 한번 생성하면 길이를 변경할 수 없다. 더 많은 저장 공간이 필요하다면 더 큰 길이의 배열을 새로 만들고
	// 이전 배열로부터 항목들을 복사해야 한다. 예를 들어 길이 3인 배열의 항목을 길이 5인 배열로 다음과 같이 복사 할 수 있다.
	public static void main(String[] args) {
		// 가장 기본적인 복사 방법은 for문을 이용해서 항목을 하나씩 읽고 새로운 배열에 저장하는 것이다.
		
		// 길이 3인 배열
		int[] oldIntArray = {1, 2, 3,};
		
		// 길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		
		// 배열 항목 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		// 배열 항목 출력
		for (int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
	}

}

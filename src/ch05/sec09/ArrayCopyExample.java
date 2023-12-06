package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열 복사를 위한 좀 더 간단한 방법이 있다. System의 arraycopy()메소드를 이용하면 한줄만으로도 복사 가능
		// 원본 배열이 arr1이고 새 배열이 arr2일 경우 arr1의 모든 항목을 arr2에 복사하려면 다음과 같이 System.arraycopy()
		// 메소드를 호출하면 된다. 
		
		// System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		
		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		
		// 길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		
		// 배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		// 배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}

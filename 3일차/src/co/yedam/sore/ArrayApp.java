package co.yedam.sore;

public class ArrayApp {
	int[] arr = new int[10];
	
	void init() {
		//배열에 초기값 지정
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
			}
	}
	void print() {
		//배열 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void max() {
		//최댓값
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값="+max);
			}
	
	void total() {
		//합계
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			result += arr[i];
		}
		System.out.println("합계="+result);
	}
}

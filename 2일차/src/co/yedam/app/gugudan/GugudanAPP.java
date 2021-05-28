package co.yedam.app.gugudan;

public class GugudanAPP {

	//입력받은 단만 출력
	void printDan(int dan) {
		// 2*1=2 ~ 2*9=18
		
		for(int j=1;j<=9;j++) {
				System.out.println(dan+"*"+j+"="+(dan*j));
	}
	}

	
	void printRange(int s, int e) {
		//s단부터 e단까지 출력
		
	}
	void printAll() {
		//9단까지 모두 출력
		for (int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
	}
		}
	}
	void printAllReverse() {
		//9단부터 거꾸로 출력
		for (int i=9;i>0;i--) {
			for(int j=9;j>0;j--) {
				System.out.println(i+"*"+j+"="+(i*j));
	}
		}

	}
	
}

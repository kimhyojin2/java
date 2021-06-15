package co.yedam.exam;

public class ExamScore {

	String examNum;
	int kor;
	int his;
	int eng;
	int avg;
	
	Scanner scanner = new Scanner(System.in);
	int avg() {
	 (kor+his+eng) / 3;
	}	
	String isPass = (avg>=60) ? "합격" : "불합격";
}

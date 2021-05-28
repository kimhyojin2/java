package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균. 등급 계산
 */

public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	//성적입력
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어성적");
		kor = scanner.nextInt();
		System.out.println("영어성적");
		eng = scanner.nextInt();
		System.out.println("수학성적");
		mat = scanner.nextInt();
	}	
	
	//합계 계산
	int getSum() {
		//sum 계산
		sum = kor + eng + mat;
		return sum;
	}
	
	float getAvg(){
		//평균 계산하고 리턴
		avg = sum / 3;
		return avg;
	}
	
	boolean isPass() {
		//평균이 60이상 true
		//아니면 false;
		if (sum>=60) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	char getGrade() {
		
		switch ((int) avg / 10) { // 80 상 60중 하
		case 10:
			grade = '상';
		case 9:
			grade = '상';
		case 8:
			grade = '상'; break;
		case 7:
			grade = '중'; 
		case 6:
			grade = '중'; break;
		default:
			grade = '하'; break;
		}
		return grade;
	}
}

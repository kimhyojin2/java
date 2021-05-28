package co.yedam.app;

import java.util.Scanner;

public class MemberInfo {
	
//	//String name;
//	//String id;
//	//String tel;
	//키, 몸무게
	double weight;  //몸무게
	double height;  //키
	void heightWeightInput() {
		Scanner scanner = new Scanner(System.in);
		//코드 작성
		System.out.println("키(cm):");
		height = scanner.nextDouble();
		System.out.println("체중(kg):");
		weight = scanner.nextDouble();
		scanner.close();
	}
	//BMI= 체중(kg) /(키(m)× 키(m))
	String bmi() {
		double result = 0;  //bmi결과
		//코드 추가
		result = weight /((height/100) * (height/100));
		String s = "";
		//코드추가
		if (result < 18.5) {
		    s="저체중";
		}
		else if (result<23){
		    s="정상";
		}
		else if (result<25){
		    s="과체중";
		}
		else if(result<30){
		    s="비만";
		}
		else if(result>30){
		    s="고도비만";
		}
		return s;
	}
	
	
	
	/*
	void input() {
		Scanner scanner = new Scanner(System.in);
		// 코드 작성
		System.out.println("1. 이름:");
		name = scanner.next();
		System.out.println("2. 주민번호:");
		id = scanner.next();
		System.out.println("3. 전화번호:");
		tel = scanner.next();
		scanner.close();
	}
	
	void print(){
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}
*/
}

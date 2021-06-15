package exam02;

import java.util.Scanner;

public abstract class 문제4 {

	public static void main(String[] args) {
		
		String gender = "";
		
		Scanner scanner = new Scanner(System.in);
		String[]arr = {"010102-2", "991012-1", "960304-1", "881012-2", "040403-1"};
		int age = Integer.parseInt();
		
		char ch = charAt(7);
		if(ch == '1') {gender = "남성";}
		else if(ch == '2') {gender = "여성";}
		
		if(ch == '1' || ch=='2') {age = 2021-(1900+age) + 1;}
		else if(ch == '3' || ch == '4') {age = 2021-(2000+age) + 1;}
		
		System.out.println();
		System.out.println("10대" + "명");
		System.out.println("20대" + "명");
		System.out.println("30대" + "명");
		System.out.println("40대" + "명");
		
	}

}

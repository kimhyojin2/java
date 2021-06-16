package co.vendingmachine;

import java.util.Scanner;

import co.vendingmachine.view.MachineApp2;
import co.vendingmachine.view.MachineApp;

public class AppMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String ad_id;
		int ad_pw;

		//MachineApp = 소비자
		//MachineApp2 = 관리자
		MachineApp app = new MachineApp();
		MachineApp2 app2 = new MachineApp2();

		// 아이디 :admin 비번:1234
		System.out.println("1. 소비자 2. 관리자");
		int num = scn.nextInt();
		if (num == 2) {
			System.out.println("<관리자 로그인>");
			System.out.println("관리자 아이디를 입력하세요.");
			ad_id = scn.next();
			if (ad_id.equals("admin")) {
				System.out.println("관리자 비밀번호를 입력하세요.");
				ad_pw = scn.nextInt();
				if (ad_pw == 1234) {
					app2.start();
				}
			} else {
				System.out.println("접근 권한이 없습니다.");
			}

		}
		else if( num == 1) {
			app.start();
		}
	}

}

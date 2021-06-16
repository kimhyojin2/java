package co.vendingmachine.view;

import java.util.Scanner;

import co.vendingmachine.access.MachineAccess;
import co.vendingmachine.access.MachineDAO;
import co.vendingmachine.access.ScannerUtil;
import co.vendingmachine.model.Machine;

//소비자
public class MachineApp {
	MachineAccess drinkList = new MachineDAO();
	Scanner scn = new Scanner(System.in);

	public void start() {
		int menunum;
		do {
			menuTitle();
			System.out.println(">");
			menunum = ScannerUtil.readInt();
			switch (menunum) {
			case 1:
				insert_Coin();
				break;
			case 2:
				return_Coin();
				break;
			case 3:
				print_Menu();
				break;
			case 4:
				choice_Menu();
				break;
			}
		}while (menunum != 0);

	}
	public void menuTitle() {
		System.out.println("==========자판기==========");
		System.out.println("|       1.동전 투입       |");
		System.out.println("|       2.잔돈 반환       |");
		System.out.println("|       3.메뉴 보기       |");
		System.out.println("|       4.메뉴 선택       |");
		System.out.println("==========0.종료==========");
	}
	
	
	private void insert_Coin() {
		
	}
	private void return_Coin() {
		
	}
	private void print_Menu() {
		
	}
	private void choice_Menu() {
		System.out.println("원하시는 메뉴의 이름을 입력하세요>");
		String name = ScannerUtil.readStr(); 
		Machine machine = drinkList.choice_Menu(name);
		System.out.println(machine);
		
		
	}
}

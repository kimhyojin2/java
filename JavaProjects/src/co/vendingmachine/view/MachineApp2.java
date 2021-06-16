package co.vendingmachine.view;

import java.util.Scanner;

import co.vendingmachine.access.MachineAccess;
import co.vendingmachine.access.MachineDAO;
import co.vendingmachine.access.ScannerUtil;
import co.vendingmachine.model.Machine;

//관리자
public class MachineApp2 {

	MachineAccess drinkList2 = new MachineDAO();
	Scanner scn = new Scanner(System.in);

	// 프로그램 시작
	public void start() {
		int menunum;
		do {
			menuTitle2();
			System.out.println(">");
			menunum = ScannerUtil.readInt();
			switch (menunum) {
			case 1:
				enter_Menu();
				break;
			case 2:
				delete_Menu();
				break;
			case 3:
				update_Menu();
				break;
			case 4:
				enter_Stock();
				break;
			}
		} while (menunum != 0);
	}

	private void enter_Menu() {
		Machine machine = ScannerUtil.readMachine();
		drinkList2.enter_Menu(machine);

	}

	private void enter_Stock() {
		Machine machine = new Machine();
		System.out.println("추가로 재고 등록할 메뉴의 이름을 입력하세요>");
		String name = scn.next();
		machine.setDrink_name(name);
		System.out.println("재고등록 메뉴 정보를 입력하세요>");
		System.out.println("제품명, 가격, 재고수량");
		String result = scn.next();
		String[] arr = result.split(",");
		int drink_price = Integer.parseInt(arr[1]);
		machine.setDrink_price(drink_price);
		int drink_stock = Integer.parseInt(arr[2]);
		machine.setDrink_stock(drink_stock);
		machine.setDrink_name(arr[0]);
	}

	private void update_Menu() {
		Machine machine = new Machine();
		System.out.println("수정할 메뉴의 이름을 입력하세요>");
		String name = scn.next();
		machine.setDrink_name(name);
		System.out.println("새 메뉴 정보를 입력하세요>");
		System.out.println("제품명, 가격, 재고수량");
		String result = scn.next();
		String[] arr = result.split(",");
		int drink_price = Integer.parseInt(arr[1]);
		machine.setDrink_price(drink_price);
		int drink_stock = Integer.parseInt(arr[2]);
		machine.setDrink_stock(drink_stock);
		machine.setDrink_name(arr[0]);

	}

	private void delete_Menu() {

	}

	public void menuTitle2() {

	}

}

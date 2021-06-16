package co.vendingmachine.access;

import java.util.Scanner;

import co.vendingmachine.model.Machine;

public class ScannerUtil {

	static Scanner scn = new Scanner(System.in);

	public static Machine readMachine() {
		System.out.println("제품명, 가격, 재고수량");
		String result = scn.next();
		String[] arr = result.split(",");
		Machine machine = new Machine();
		int drink_price = Integer.parseInt(arr[1]);
		machine.setDrink_price(drink_price);
		int drink_stock = Integer.parseInt(arr[2]);
		machine.setDrink_stock(drink_stock);
		machine.setDrink_name(arr[0]);
		return machine;
	}

	public static String readStr() {
		String result = "";
		try {
			result = scn.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static int readInt() {
		int result = 0;

		while (true) {
			try {
				String userInput = scn.next();
				result = Integer.parseInt(userInput);
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		return result;
	}

}

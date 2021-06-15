package co.memo.access;

import java.util.Scanner;

import co.memo.model.Memo;

public class ScannerUtil {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static Memo readMemo() {
		System.out.println("날짜, 제목, 내용>");
		String result = scanner.next();
		String[]arr = result.split(",");
		Memo memo = new Memo(arr[0], arr[1], arr[2]);
		return memo;
	}

	public static String readStr() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static int readInt(String string) {
		int result = 0;

		while (true) {
			try {
				String userInput = scanner.next();
				result = Integer.parseInt(userInput);
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		return result;
	}
	
}

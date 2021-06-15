package co.friend.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {

	static Scanner scanner = new Scanner(System.in);

	public static String readDate() {
		String result = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		do {
			try {
				result = scanner.next();
				df.parse(result.trim());
				break;
			} catch (Exception e) {
				System.out.println("(yyyyMMdd)");
			}
		} while (true);
		return result;
	}

	// Friend 입력
	public static Friend readFriend() {
		System.out.println("구분, 이름, 전화번호>");
		String result = scanner.next();
		String[] arr = result.split(",");
		Friend friend = new Friend(arr[0], arr[1], arr[2]);
		// friend.setGubun(arr[0]);
		// friend.setName(arr[1])
		// friend.setTel(arr[2])
		return friend;
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

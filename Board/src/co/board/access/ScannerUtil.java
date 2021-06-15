package co.board.access;

import java.util.Scanner;

import co.board.model.Board;

public class ScannerUtil {

	static Scanner scanner = new Scanner(System.in);

	public static Board readBoard() {
		System.out.println("제목, 내용, 작성자>");
		String result = scanner.next();
		String[]arr = result.split(",");
		Board board = new Board(arr[0], arr[1], arr[2]);
		return board;
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

	public static int readInt() {
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

package co.yedam.app;

import java.util.Scanner;

public class TryTest {

	public static void main(String[] args) {
		// NullPointerException
		try {
			String s = null;
			System.out.println(s.charAt(0));
		} catch (Exception e) {
		}
		{
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		// ArrayIndexOutOfBoundsException
		try {
			int[] arr = new int[5];
			System.out.println(arr[5]);
		} catch (Exception e) {
		}
		{
			System.out.println(e.getMessage());
		}

		int a = 0;
		while (true) {
			try {
				System.out.println("입력>");
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
				if(a<5)
					break;
				//int a = scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("a: " + a);
		System.out.println("the end");

	}

}

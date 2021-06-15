package exam02;

import java.util.Scanner;

public class BookServiceInsert implements BookService{
	
	Scanner scanner = new Scanner(System.in);
	
	public BookServiceInsert() {}
	

	@Override
	public void execute(BookList list) {
		System.out.println("입력 : ");
		
		
		String result = scanner.nextLine();
		
		String[] arr = result.split(",");
		Book book = new Book();
		
		
		book.setIsbn(arr[0]);
		book.setName(arr[1]);
		book.setContent(arr[2]);
		list.insert(book);
		
		
	}
}

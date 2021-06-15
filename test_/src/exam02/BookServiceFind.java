package exam02;

import java.util.List;
import java.util.Scanner;

public class BookServiceFind implements BookService{
	
	Scanner scanner = new Scanner(System.in);
	
	public BookServiceFind() {}
	
	@Override
	public void execute(BookList list) {
		System.out.println("입력 : ");
		
		String name = scanner.next();
		List<Book> listt = list.findName(name);
		for (Book a : listt) {
			System.out.println(a);		
		
		}
		
	}

}

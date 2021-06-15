package exam02;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess{
	
	ArrayList<Book> mybook;
	
	public BookList() {
		mybook = new ArrayList<Book>();
	}

	@Override
	public void insert(Book book) {
		mybook.add(book);
		
	}

	@Override
	public List<Book> findName(String name) {
		List<Book> list = new ArrayList<Book>();
		for (Book b : mybook) {
			if(b.getName().contains(name))
			list.add(b);
		}
		
		return list;
	}

}
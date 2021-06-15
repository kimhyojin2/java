package exam;

import java.util.ArrayList;
import java.util.List;
/*
 * 여러건의 도서 정보를 저장 -> DAO
 */
public class BookList extends BookAccess  {
	
	ArrayList<Book> books = new ArrayList<Book>();

	@Override
	public void insert(Book friend) {
		books.add(friend);
	}

	@Override
	public List<Book> findName(String name) {      //여러건 조회하는거라 List<Book>
		List<Book> list = new ArrayList<Book>(); 
		for (Book b : books) {                     //모든 도서 비교
			if(b.getName().contains(name)) {       //도서명이 포함된 도서만
				list.add(b); 
			}
		}
		return list; 
	}

	@Override
	public Book findIsbn(String isbn) {
		Book book = null;
		for (Book b : books) {
			if(b.getIsbn().equals(isbn)) {
				book = b;
				break;
			}
		}
		return book;
	}

	@Override
	public List<Book> findAll() {
		List<Book> list = new ArrayList<Book>();
		for (Book b : books) {
			if(b.getName().contains()) {
				
			}
		}
		return null;
	}

}

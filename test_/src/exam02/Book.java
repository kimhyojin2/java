package exam02;

public class Book {
	private String isbn;
	private String name;
	private String content;
	
	public Book() {}
	public Book(String isbn, String name, String content) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.content = content;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public String toString() {
		return "Book [isbn=" + isbn + ",name=" + name + ", content=" + content + "]";
	}
	
}

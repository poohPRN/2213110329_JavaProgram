
public class Book {
	private String title;
	private Author author;
	private int page;

	
	public Book(String title,Author author,int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public Book(String title,Author author) {
		this(title,author, 0);
	}
	
	public Book() {
		title="";
		author=null;
		page=0;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return this.page;
	}
	
	public String toString() {
		return "Book Title : "+getTitle() +
				" ("+getPage()+")";
	}
}

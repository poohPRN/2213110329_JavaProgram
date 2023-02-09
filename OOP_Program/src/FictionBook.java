
public class FictionBook implements Author1,Book1{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean checkEmail() {
		
	}
	@Override
	public String getFirstName() {
		
	}
	@Override
	public String getLastName() {
		
	}
	public boolean checkFormatName() {
		
	}
	@Override
	public int totalPublicYear() {
		
	}
	
	public String toString() {
		return getTitle()+"write by "+getLastName()+getFirstName()+;
	}
}

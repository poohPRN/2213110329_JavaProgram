import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author email:");
		String title = JOptionPane.showInputDialog("Input book title");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page"));
		int confirm = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null,"is the page correct?","Confirm",confirm);
		if(confirm == JOptionPane.NO_OPTION) {
			JOptionPane.showInputDialog("Input book page,again");
		}
		Book book = new Book(title,new Author(name,email),page);
		JOptionPane.showMessageDialog(null,"Book Title : "+title +
				"\nAuthor name : "+name+
				" ("+page+")"+
				"\nAuthor e-mail : "+ email);
		
	}

}

import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scan.next();
		
		Author auth = new Author(name,email);
		System.out.print(auth);
		
		System.out.println();
		System.out.print("Input book title : ");
		scan.nextLine();
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		
		Book book = new Book(title,auth,page);
		System.out.print(book);
	}

}

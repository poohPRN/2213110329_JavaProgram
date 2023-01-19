import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		String name;
		String email;
		Scanner scan = new Scanner(System.in);
		Author[] author = new Author[4];
		for(int i=0;i<author.length;i++) {
			System.out.println("Information Author "+(i+1));
			System.out.println("------------------------------------------");
			System.out.print("Input author name :");
			name= scan.nextLine();
			System.out.print("Input author e-mail : ");
			email = scan.nextLine();
			System.out.println("------------------------------------------");
		}
		System.out.println();
		int num = 1;
		for(Author _author:author) {
			System.out.println(num+_author.getName()+" ("+_author.getEmail()+")");
		}
	}

}

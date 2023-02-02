import java.util.*;
public class MovieDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id;
		String name;
		String diName;
		String diEmail;
		char diGender;
		int num;
		System.out.print("Input movie id : ");
		id = scan.nextLine();
		System.out.print("Input movie name : ");
		name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name : ");
		diName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		diEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		diGender = scan.nextLine().toUpperCase().charAt(0);
		while(diGender !='M'&& diGender!='F') {
			System.out.print("Input director gender, again : ");
			diGender = scan.nextLine().toUpperCase().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theator no.  : ");
		num = scan.nextInt();
		while(num < 1||num >15) {
			System.out.print("Please input 1 - 15 only : ");
			num = scan.nextInt();
		}
		System.out.println();
		Theater theater = new Theater(id,name,new Director(diName,diEmail,diGender),num);
		System.out.print(theater);
	}

}

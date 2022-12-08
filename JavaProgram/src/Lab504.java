import java.util.*;

public class Lab504 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		String fisrtName = fullname.substring(0,fullname.indexOf(' '));
		System.out.println(abbreviatName(fullname)+fisrtName);
	}
	
	public static String abbreviatName(String fullname) {
		String nameCrop = "";
		for(int i = 0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				nameCrop=(nameCrop+fullname.charAt(i+1)).toUpperCase();
				nameCrop=nameCrop + ".";
			}
		}
		return nameCrop;
	}

}

import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String someSentence = scan.nextLine();
		while(!someSentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			someSentence = scan.nextLine();
		}
		int j = 0;
		System.out.println();
		for(int i=0;i<someSentence.length();i++) {
			if(someSentence.charAt(i)==' ') {
				System.out.println(someSentence.substring(j,i));
				j=i+1;
			}
		}
		System.out.println(someSentence.substring(j));
	}

}

import java.util.*;

public class Example_403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		String sentence = scan.nextLine();
		while(sentence.endsWith(".")) {
			System.out.println("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceOfWord=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceOfWord++;
			}
		}
		System.out.println("This sentence has "+spaceOfWord+" spacebars.");
		System.out.println("This sentence has "+(spaceOfWord+1)+" words.");
		
	}

}

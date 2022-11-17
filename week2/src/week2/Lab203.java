package week2;
import java.util.Scanner;

public class Lab203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a b): ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int numAll = num1 + num2;
		System.out.println("Sum of two integers : "+numAll);
		int counting = 0;
		while(numAll != 0) {
			numAll/=10;
			++counting;
		}
		System.out.println("Digit number of sum of said two integers: "+"\n"+counting);

	}

}

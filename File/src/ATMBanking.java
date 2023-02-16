import java.io.*;
import java.util.*;

public class ATMBanking {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter account number : ");
		String ID = scan.next();
		System.out.print("Enter password : ");
		String PW = scan.next();
		while(PW.length()!=4) {
			System.out.print("Enter password : ");
			PW = scan.next();
		}
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while(money%2!=0&&money<=0) {
			System.out.print("Enter money : ");
			money = scan.nextInt();
		}
		System.out.println();
		ATMChecking bank = new ATMChecking(ID,PW,money);
		bank.show();
	}

}

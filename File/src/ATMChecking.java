import java.io.*;
import java.util.*;
public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException{
		Scanner in = new Scanner(new File("ATMBookBank.txt"));
		
		return false;
	}
	
	public void show() {
		
	}
	
	
}

import java.util.*;
public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	//static Product pd = new Product();
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		for(Product pd : productList) {
			pd = new Product();
			System.out.print("Input product Id : ");
			pd.setId(scan.next());
			System.out.print("Input product Unit : ");
			int item = scan.nextInt();
			pd.setUnit(item);
			while(item<=0) {
				System.out.print("Input product Unit, again : ");
				item = scan.nextInt();
				pd.setUnit(item);
			}
			System.out.print("Input product Price : ");
			double money = scan.nextDouble();
			pd.setPrice(money);
			while(money<=0) {
				System.out.print("Input product Price, again : ");
				money = scan.nextDouble();
				pd.setPrice(money);
			}
			System.out.println();
		}//end for
		System.out.println("-------------------------------");
		for (Product pd:productList) {
			System.out.println("Product ID : "+pd.getid()+" Total price ="+pd.calculate());
		}
	}
}

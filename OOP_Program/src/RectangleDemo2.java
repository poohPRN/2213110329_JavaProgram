import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double width;
		double length;
		System.out.print("Enter width : ");
		width = scan.nextDouble();
		System.out.print("Enter length");
		length = scan.nextDouble();
		Rectangle2 rec = new Rectangle2(width,length);
		System.out.println(rec);
		System.out.println("Area of Rectangle is "+rec.getArea());
	}

}

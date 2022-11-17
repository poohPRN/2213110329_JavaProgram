package week2;
import javax.swing.JOptionPane;

public class MusicWorldApp {
	static final double TAX_RATE = 0.0625;
	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog("This progeam calcutes the total cost of a CD order "
				+ "\nPlease enter the ID of the CD",
				JOptionPane.QUESTION_MESSAGE);
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars",
				JOptionPane.QUESTION_MESSAGE));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased",
				JOptionPane.QUESTION_MESSAGE));
		double cdSubtotal = cdPrice*cdQuantity;
		double cdTotal = cdSubtotal + TAX_RATE;
		JOptionPane.showMessageDialog(null,
				"Summary of the transection: "+
		"\n\nCD ID:"+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price: "+cdPrice+
		"\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+cdSubtotal+"\nTax rate: "+TAX_RATE*100+"%\nTotal: $"+cdTotal+
		"\n\nEnd of Program");

	}

}

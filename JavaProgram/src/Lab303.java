import javax.swing.*;
import java.util.Random;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw;
		withdraw= Integer.parseInt(JOptionPane.showInputDialog(null,
				"Your balance:"+balance+"\nInput money to withdraw:",
				"Input",
				JOptionPane.QUESTION_MESSAGE));
		int withdrawThousand = withdraw /1000;
		int withdrawFiveHandred = (withdraw%1000)/500;
		int withdrawHandred = (withdraw%500)/100;
		int check = withdraw%100;
		if(withdraw>20000) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw more then 20,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}else if(withdraw>balance) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw more then balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}else if (withdraw<100) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw more "+withdraw+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}else if(check>1) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw  "+check+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}else if(withdraw<=balance) {
			JOptionPane.showMessageDialog(null,
					"You withdraw"+withdraw+" baht."+
			"\n1000 ="+withdrawThousand+
			"\n500 ="+withdrawFiveHandred+
			"\n100 ="+withdrawHandred);
		}

	}
}
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(43, 25, 123, 47);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(166, 32, 133, 23);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(43, 81, 113, 14);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(166, 77, 133, 23);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResult.setBounds(335, 181, 62, 23);
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(43, 106, 46, 14);
		contentPane.add(lblOperator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(170, 112, 133, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		
		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(43, 145, 123, 14);
		contentPane.add(rdbOperator);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(170, 141, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(166, 167, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		JLabel lblNewLabel = new JLabel("Option to show");
		lblNewLabel.setBounds(43, 188, 46, 14);
		contentPane.add(lblNewLabel);
		
		final JCheckBox chkDialogBox = new JCheckBox("show Result at Dialogbox");
		chkDialogBox.setBounds(166, 197, 97, 23);
		contentPane.add(chkDialogBox);
		
		contentPane.add(chOperator);
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
					}
				}
			}
		});
		btnOK.setBounds(113, 227, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnEXIT = new JButton("Exit");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEXIT.setBounds(231, 227, 89, 23);
		contentPane.add(btnEXIT);
		
		
	}
}

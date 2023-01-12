import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame{

	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	//Components
	private JLabel lblLenght,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLenght,txtWidth,txtArea,txtPerimeter;
	
	//Constructor Method
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Properties for Components
		lblLenght = new JLabel("Enter the length:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the Width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.RIGHT);
		//TextFields
		/*txtLenght = new JTextField("10");
		txtWidth = new JTextField("");
		txtArea = new JTextField("");
		txtPerimeter = new JTextField("");*/
		
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLenght);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
	}
	public static void main(String[] args) {
		TestGUI prog = new TestGUI();

	}

}

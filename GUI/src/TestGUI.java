import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	private JLabel lbllength,lblwidth,lblarea,lblperimeter;
	
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		lbllength = new JLabel("Enter the length");
		lblwidth = new JLabel("Enter the width");
		lblarea = new JLabel("Area:");
		lblperimeter = new JLabel("Perimeter:");
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		
		add(lbllength);
		add(lblwidth);
		add(lblarea);
		add(lblperimeter);
	}
	
	public static void main(String[] args) {
		TestGUI JFrame= new TestGUI();

	}

}

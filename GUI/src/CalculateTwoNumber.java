import java.awt.EventQueue;
import java.text.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber1.setBounds(55, 42, 113, 35);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber2.setBounds(55, 102, 119, 35);
		contentPane.add(lblNumber2);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(213, 51, 158, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(213, 111, 158, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResult.setBounds(213, 297, 170, 35);
		contentPane.add(lblResult);
		
		JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(213, 172, 89, 22);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");
		contentPane.add(cmbOperator);

		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperator.setBounds(55, 167, 100, 29);
		contentPane.add(lblOperator);
		
		JRadioButton rdbtn1Digit = new JRadioButton("1 Digit");
		rdbtn1Digit.setBounds(213, 230, 109, 23);
		contentPane.add(rdbtn1Digit);
		
		JRadioButton rdbtn2Digit = new JRadioButton("2 Digit");
		rdbtn2Digit.setBounds(213, 256, 109, 23);
		contentPane.add(rdbtn2Digit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn1Digit);
		group.add(rdbtn2Digit);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1=Double.parseDouble(txtNumber1.getText());
					num2=Double.parseDouble(txtNumber2.getText());
					//sum=num1+num2;
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+"))
						sum=num1+num2;
					if(operator.equals("-"))
						sum=num1-num2;
					if(operator.equals("*"))
						sum=num1*num2;
					if(operator.equals("/"))
						sum=num1/num2;
					
					DecimalFormat frmNumber = null;
					if(rdbtn1Digit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if(rdbtn2Digit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					
					lblResult.setText(frmNumber.format(sum));

				}
			}
		});
		btnOK.setBounds(79, 343, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(254, 343, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("How to show digit");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(55, 229, 127, 20);
		contentPane.add(lblNewLabel);
		

		
		
		

	}
}

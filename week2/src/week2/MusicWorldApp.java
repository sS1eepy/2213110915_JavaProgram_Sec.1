package week2;

import javax.swing.JOptionPane;
import java.text.*;

public class MusicWorldApp {

	public static void main(String[] args) {
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		NumberFormat f2 = NumberFormat.getPercentInstance();
		DecimalFormat f3 = new DecimalFormat("#,###.00");
		
		String cdId;
		String cdTitle;
		double cdTotal;
		double cdSubtotal;
		final double TAX_RATE = .0625;
		double tax=TAX_RATE*100;
		
		cdId = JOptionPane.showInputDialog("This program calculate the total cost of a CD order \nPlease enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchase"));
		
		cdSubtotal = cdPrice * cdQuantity;
		cdTotal = cdSubtotal * (1 + TAX_RATE);
		
		JOptionPane.showMessageDialog(null,"Summary of the transaction:\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price: $"+f3.format(cdPrice)+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+cdSubtotal+"\nTax rate: "+tax+"%\nTotal: $"+cdTotal+"\n\nEnd of Program");

		
	}

}

package week3;
import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int pricePerson = 299;
	public static void main(String[] args) {
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = pricePerson * numberofCustomer;
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null,"Total Price is "+totalPrice+" baht."+"\nDo you have a member card?");
		}while(memberCard==2);
		double totalPricewithDiscount;
		if(memberCard==0) {
			totalPricewithDiscount = totalPrice*90/100;
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+totalPricewithDiscount+" baht.");
		}
		else if(memberCard==1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+totalPrice+" baht.");
		}
		
	
	}
}

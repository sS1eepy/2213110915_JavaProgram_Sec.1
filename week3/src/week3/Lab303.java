package week3;
import java.util.Random;
import java.util.Random.*;
import javax.swing.*;
import java.text.*;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		DecimalFormat f3 = new DecimalFormat("#,###");
		int balance = rand.nextInt(9) * 100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("You balance : "+f3.format(balance)+"\nInput money to withdraw:"));
		int e = money/1000;
		int h= (money%1000)/500;
		int t= (money%1000)%500/100;
		if(money>balance) {
			JOptionPane.showMessageDialog(null, "ERROR: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money>20000) {
			JOptionPane.showMessageDialog(null, "ERROR: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money%100!=0) {
			int hm = money%100;
			JOptionPane.showMessageDialog(null, "ERROR: Cannot withdraw "+hm+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+f3.format(money)+" baht."+"\n1000 = "+e+"\n500 = "+h+"\n100 = "+t);
		}
		
	}

}

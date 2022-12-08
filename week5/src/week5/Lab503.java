package week5;
import javax.swing.*;
public class Lab503 {
	static int inputYear;
	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));
		
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000"+"\nInput Year,again"));
		}
		if(isLeapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear+" is Leap Year");
		}else {
			JOptionPane.showMessageDialog(null, inputYear+" is not Leap Year");
		}
	}
	
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100 !=0) || (year%400==0))) {
			return true;
		}else {
			return false;
		}
	}
}

package week3;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input Full name:");
		int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Input Birth Year"));
		while (birthYear < 1980 || birthYear > 2018) {
			birthYear = Integer.parseInt(JOptionPane.showInputDialog("Input Birth Year"));
		}
		int gender = JOptionPane.showConfirmDialog(null, "Are you Female?","Gender",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "Full name: " +name+
									"\nBirth year: "+birthYear+
									"\nYou're: "+(gender==0?"Female":"male"));

	}

}

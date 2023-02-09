import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder[] cylinder = new Cylinder[5];
		for(int i =0;i<cylinder.length;i++) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius "+(i+1)));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height "+(i+1)));
		cylinder[i] = new Cylinder (radius,height);
		}
		int num=1;
		String chil="";
		for(Cylinder i: cylinder) {
			chil=chil+"Cylinder "+num+", volume = "+i.getVolume()+"\n";
			num++;
		}
		JOptionPane.showMessageDialog(null,chil);
	}

}

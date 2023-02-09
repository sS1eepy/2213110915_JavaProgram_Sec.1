import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		for(int i =0 ; i<cylinder.length;i++) {
			System.out.print("Input radius "+(i+1)+" : ");
			double radius = scan.nextDouble();
			System.out.print("Input height "+(i+1)+" : ");
			double height = scan.nextDouble();
			cylinder[i] = new Cylinder (radius,height);
		}
		int num=1;
		for(Cylinder i: cylinder) {
			System.out.println("Cylinder "+num+", volume = "+i.getVolume());
			num++;
		}
		
	}

}

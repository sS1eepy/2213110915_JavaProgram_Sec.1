import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius , null);
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println("Circle ["+circle.toString()+"]");
		System.out.println("Circle [area = "+circle.getArea()+"]");
		System.out.println();
		System.out.println("Cylinder ["+cylinder.toString()+"]");
		System.out.println("Cylinder [area = "+cylinder.getArea()+"]");
		System.out.println("Cylinder [volume = "+cylinder.getVolume()+"]");
	}

}

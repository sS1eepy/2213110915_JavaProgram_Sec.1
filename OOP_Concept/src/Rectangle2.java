
public class Rectangle2 implements Shape2 {

	private double width;
	private double length;
	
	
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	@Override
	public String toString() {
		return "Rectangle[width = "+getWidth()+" ,length = "+getLength()+" ,color = "+color+"]";
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
}

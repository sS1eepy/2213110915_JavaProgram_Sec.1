package week6;

public class Product {
	private String id;
	private int unit;
	private double price;
	
	public void setId(String ID) {
		id = ID;
	}
	public String getid() {
		return id;
	}
	public void setUnit(int UNIT) {
		unit = UNIT;
	}
	public int getunit() {
		return unit;
	}
	public void setPrice (double PRICE) {
		price = PRICE;
	}
	public double getprice () {
		return price;
	}
	public double calculate() {
		return unit * price;
	}
	public String Status() {
		if(unit<5) {
			return "LOW";
		}
		else if(unit>=5&&unit<=50) {
			return "NORMAL";
		}
		else {
			return "HIGH";
		}
	
	}
}
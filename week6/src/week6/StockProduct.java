package week6;
import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat f1= new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		double total = 0;
		Product[] stock = new Product[4];
		for(int i =0;i<stock.length;i++) {
			stock[i]=new Product();
			System.out.print("Input product Id    : ");
			stock[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stock[i].setUnit(scan.nextInt());
			while(!(stock[i].getunit()>0)) {
				System.out.print("Input product Unit, again  : ");
				stock[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			stock[i].setPrice(scan.nextDouble());
			while(!(stock[i].getprice()>0)) {
				System.out.print("Input product Price, again : ");
				stock[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		for(Product _stock : stock) {
			System.out.println("Product Id : "+_stock.getid()+", Total price = "+f1.format(_stock.calculate())+" baht.");
			total+=_stock.calculate();
		}
		/*for(int i=0;i<stock.length;i++) {
			stock[0].calculate();
		}*/
		System.out.println("----------------------------------------------");
		System.out.println("Total price of all product is "+f1.format(total)+" baht.");
		
		

	}

}

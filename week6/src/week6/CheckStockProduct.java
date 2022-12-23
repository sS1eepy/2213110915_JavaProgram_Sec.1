package week6;

import java.util.Scanner;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int list = scan.nextInt();
		System.out.println();
		Product[] stock = new Product[list];
		for(int i =0;i<stock.length;i++) {
			stock[i]=new Product();
			System.out.print("Input product Id    : ");
			stock[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stock[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------");
		for(Product _stock : stock) {
			if(_stock.Status().equalsIgnoreCase("LOW")) {
				System.out.println(">> "+_stock.getid()+" has "+_stock.getunit()+" units");
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------");
		for(Product _stock : stock) {
			if(_stock.Status().equalsIgnoreCase("NORMAL")) {
				System.out.println(">> "+_stock.getid()+" has "+_stock.getunit()+" units");
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------------");
		for(Product _stock : stock) {
			if(_stock.Status().equalsIgnoreCase("HIGH")) {
				System.out.println(">> "+_stock.getid()+" has "+_stock.getunit()+" units");
			}
		}
	}
}

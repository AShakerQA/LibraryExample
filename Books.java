package main;

public class Books extends Item{
	private int barcode;
	
	public Books(String name, int id, int barcode) {
		super(name, id);
		this.barcode = barcode;
	}
	
	public int getBarcode() {
		return barcode;
	}
	
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	
	public void read() {
		System.out.println("interesting...");
	}
	
	
}

package main;

public abstract class Item {

	private int id;
	private String name;
	private boolean available = true;
	
	public Item(String name, int id) {
		super();
		this.name = name;
		this.id = id; //id++
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
	return name;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
}

package main;

public class Map extends Item{
	private String create;
	
	public Map(String name, String create) {
		super(name); //putting name into constructor to use
		//different one with String name
		this.create = create;
	}
	
	public String getCreate() {
		return create;
	}
	
	public void setCreate(String create) {
		this.create = create;
	}
	
	public void read() {
		System.out.println("FORWARD!");
	}
	
}

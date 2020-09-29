package main;
import java.util.ArrayList;

public class Member {
	private int id;
	private String name;
	private ArrayList<Item> itemsOut = new ArrayList<>();
	
	public Member(String name) {
		super();
		this.name = name;
	}
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Item> itemsOut(){
		return itemsOut;
	}
	
	
}

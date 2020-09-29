package main;

import java.util.ArrayList;
public class Library {

	private int itemID;
	private int memberID;
	
	private ArrayList<Item> items = new ArrayList<>();
	
	public Library() {
		super();
	}
	
	public Library(int itemID, int memberID) {
		super();
		this.itemID = itemID;
		this.memberID = memberID;
	}

	public boolean addItem(Item item) {
		item.setID(this.itemID++);
		return this.addItem(item);
	}
	
	public boolean addMember(Member member) {
		member.setId(this.memberID++);
		return this.addMember(member);
	}
	

}

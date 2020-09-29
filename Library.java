package main;
import main.Item;
import java.util.ArrayList;
public class Library {

	private int itemID;
	private int memberID;
	
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();
	
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
		return this.items.add(item);
	}
	
	public boolean addMember(Member member) {
		member.setId(this.memberID++);
		return this.members.add(member);
	}
	
	public boolean removeMember(Member member) {
		return this.members.remove(member);
	}

	public boolean removeById(int id) {
		ArrayList<Item> modList = new ArrayList<>();
		for (Item obj : items) {
			(if obj.getId() != id){
				//i know id doesnt belong to library
				modList.add(obj);
				return true;
			}else{
				return false;
			}
		}
		items = modList;
	}
	
	
	
}

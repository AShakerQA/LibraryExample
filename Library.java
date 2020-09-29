package main;
import java.util.ArrayList;
public class Library {

	//Attributes
	private int itemID;
	private int memberID;
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Member> members = new ArrayList<>();
	
	//Constructors
	public Library() {
		super();
	}
	//Overloaded Constructor
	public Library(int itemID, int memberID) {
		super();
		this.itemID = itemID;
		this.memberID = memberID;
	}

	//Methods
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
			//compare id of items to input id
			if (obj.getId() == id){
				modList.add(obj);
			}
		}
		//remove all items in modList from items
		return this.items.removeAll(modList);
	}
	
	
	
}

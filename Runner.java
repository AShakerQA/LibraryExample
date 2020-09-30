package main;

import java.util.ArrayList;

public class Runner {

	
	
	
	public static void main(String[] args) {
		Library lib1 = new Library();
		ArrayList<Member> mems = new ArrayList<>();
		mems.add("");
		
		Books book1 = new Books("Harry Potter", 2048, 0);
		
		lib1.addItem(new Books("Harry Potter", 2048, 1));//name id barcode
		lib1.addMember(new Member(2048,"Abdul")); //id name
		lib1.removeMember(member);
		System.out.println(lib1.toString());
		lib1.removeById(2048);
		System.out.println(lib1.toString());
	}
}

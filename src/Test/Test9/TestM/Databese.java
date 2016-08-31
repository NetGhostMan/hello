package Test.Test9.TestM;

import java.util.ArrayList;

public class Databese {
	private ArrayList<Item> listItem = new ArrayList<Item>();

	public void add(Item item) {
		listItem.add(item);
	}

	public void list() {
		for (Item item : listItem) {
			item.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Databese db = new Databese();
		db.add(new CD("abc", "abc", 4, 60, "..."));
		db.add(new DVD("def", "def",4, "..."));
		db.list();
	}

}

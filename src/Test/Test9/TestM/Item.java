package Test.Test9.TestM;

public class Item {
	private String title;
	private int playingTime;
	private boolean gotIt;
	private String comment;

	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public void print() {
		System.out.print(title);
	}
}

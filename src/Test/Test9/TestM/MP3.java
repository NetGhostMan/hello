package Test.Test9.TestM;

public class MP3 extends Item {
	private int bytes;

	public MP3(String title, int playingTime, boolean gotIt, String comment, int bytes) {
		super(title, playingTime, gotIt, comment);
		this.bytes = bytes;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("MP3:");
		super.print();
		System.out.println(":" + bytes);
	}

}

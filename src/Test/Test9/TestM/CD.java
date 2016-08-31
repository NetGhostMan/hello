package Test.Test9.TestM;

public class CD extends Item {
	private String artist;
	private int numogTracks;
	public CD(String title, String artist, int numogTracks, int playingTime, String comment) {
	super(title, playingTime, false,comment);
		this.artist = artist;
		this.numogTracks = numogTracks;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("DVD:");
		super.print();
		System.out.println(":" + artist);
	}
}

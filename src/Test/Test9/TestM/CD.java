package Test.Test9.TestM;

public class CD extends Item {
	private String title;
	private String artist;
	private int numogTracks;
	private int playingTime;
	private boolean gotIt;
	private String comment;

	public CD(String title, String artist, int numogTracks, int playingTime, String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.numogTracks = numogTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CD:" + title + ":" + artist);
	}
}

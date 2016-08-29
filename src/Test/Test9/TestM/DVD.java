package Test.Test9.TestM;

public class DVD extends Item {
	private String title;
	private String director;
	private int playingTime;
	private boolean gotIt;
	private String comment;

	public DVD(String title, String director, int playingTime, String comment) {
		super();
		this.title = title;
		this.director = director;
		this.playingTime = playingTime;
		this.comment = comment;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CD:" + title + ":" + director);
	}

}

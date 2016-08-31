package Test.Test9.TestM;

public class DVD extends Item {
	private String director;

	public DVD(String title, String director,int playingTime, String comment) {
		super(title, playingTime, false, comment);
		this.director = director;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("DVD:");
		super.print();
		System.out.println(":" +director);
	}

}

package kongzhifanzhuan;

public class ButtonClass {

	public void addActionListener(ActionListener actionListener){
		System.out.println("按下了button");
		actionListener.actionPerformed();
		
	}
}

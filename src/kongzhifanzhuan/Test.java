package kongzhifanzhuan;

public class Test {

	public void TestAction(){
		System.out.println("按下了Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonClass button = new ButtonClass();
		Test test = new Test();
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed() {
				// TODO Auto-generated method stub
				test.TestAction();
				
			}
		});

	}

}

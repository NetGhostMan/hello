package Exception;
import Exception.cloceException;
import Exception.newException;
import Exception.openException;

public class testException {
	
	private int[] a = new int[10];
	
	public void f(int i) throws newException {
		if(i<=9){
		a[i] = 10;
		System.out.println("我是F");
		}else{
			System.out.println("我是F我抛出了一个异常");
			throw new newException();
		}
		
	}
	
	public void g(int i) throws openException{
		try {
			f(i);
		} catch (newException e) {
			// TODO Auto-generated catch block
			System.out.println("我接住了f的异常");
			System.out.println(e);
			throw new openException();
		}
	}
	public void h(int i) throws cloceException{
		if (i > 200){
			System.out.println("我是H，你输入的太大了");
		}else{
			try {
				g(i);
			} catch (openException e) {
				// TODO Auto-generated catch block
				System.out.println("我接住了G的异常");
				System.out.println(e);
				throw new cloceException();
			}
		}
	}
	public void k(int i) throws cloceException{
		try{
			h(i);
			System.out.println("我是K");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("我是K的异常");
			
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"testException";
	}
}

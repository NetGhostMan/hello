package hello;

public class Dadian {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}

class Display {

	private int value = 0;
	private int limit = 0;

	public Display(int limit) {
		this.limit = limit;
	}

	public void increase() {
		value++;
		if (value >= limit) {
			value = 0;
		}
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
}

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);

	public void start() {

		while (true) {
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
			}
			System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(),second.getValue());
		}
	}

	public Clock(int hour, int minute, int second) {
		if ((0 <= hour)&& (hour <24)){
			this.hour.setValue(hour);
		}else
		{
			this.hour.setValue(0);
			this.minute.setValue(0);
			this.second.setValue(-1);
		}
		if ((0 <= minute)&& (minute <60)){
			this.minute.setValue(minute);
		}else
		{
			this.minute.setValue(0);
		}
		if ((0 <= hour)&& (hour <60)){
			this.second.setValue(second);
		}else
		{
			this.second.setValue(-1);
		}
		
	}

	public void tick() {
		second.increase();
		if (second.getValue() == 0){
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
				
			}
		}
	}

	public String toString() {
		 return String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(),second.getValue());
			
		}
}

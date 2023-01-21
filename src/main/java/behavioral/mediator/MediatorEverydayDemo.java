package behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by stathis on 14/1/2017.
 */
public class MediatorEverydayDemo {

	public MediatorEverydayDemo(int seconds) {
		Timer timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
	}

	class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("RemindTask.run");
		}
	}

	class RemindTaskWithoutBeep extends TimerTask {

		@Override
		public void run() {
			System.out.println("RemindTaskWithoutBeep.run");
		}
	}

	public static void main(String[] args) {
		System.out.println("MediatorEverydayDemo.main, START");
		new MediatorEverydayDemo(1);
		System.out.println("MediatorEverydayDemo.main, END");
		System.out.println("MediatorEverydayDemo.main, START");
		new MediatorEverydayDemo(2);
		System.out.println("MediatorEverydayDemo.main, END");

	}

}

package behavioral.command;

/**
 * Created by stathis on 6/1/2017.
 */
public class CommandEveryDayDemo {

	public static void main(String[] args) {
		Task task1 = new Task(10, 12);
		Task task2 = new Task(12, 14);

		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);

		thread1.start();
		thread2.start();
	}
}

class Task implements Runnable {

	int num1;
	int num2;

	public Task(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void run() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}

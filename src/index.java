/*
 * Author: Linyi Dai
 * 
 * This is a class that automatically deals with health and happiness bar of the pet
 * When initialized with two parameters (health and happiness), 
 * it starts a timer that decreases health and happiness by 1 every second
 * If health or happiness is 0, the pet dies
 * The developer should do this initialization when the login is successful.
 * 
 * When the developer wants to know the current health or happiness,
 * Initialize a new index object with no parameters.
 * The developer shuold use the static variables health and happiness to get the current health and happiness
 * 
 * When the user clicks the button, please use applyChange(int addhunger, int addmood)
 * to increase health (or happiness) by addhunger (or addmood)
 * This function can only be called once every five seconds, to prevent cheating
 * 
 * Reference: https://www.baeldung.com/java-timer-and-timertask
 * https://docs.oracle.com/javase/8/docs/api/java/util/Timer.html
 */
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class index {
	public static boolean death = false;
	public static int health = 100;
	public static int happiness = 100;

	public index() {
		// Do nothing
	}

	public index(int Health, int Fun) {
		health = Health;
		happiness = Fun;
		TimerTask task = new TimerTask() {
			public void run() {
				// if health or happiness is 0, declare death
				if (health == 0 || happiness == 0) {
					death = true;
					dieGUI diegui = new dieGUI();
					System.exit(0);
					diegui.show();
					return;
				}
				// health and happiness decrease by 1 every second
				happiness -= 1;
				health -= 1;


				System.out.println("Task performed on: " + new Date() + "\n" +
						"Thread's name: " + Thread.currentThread().getName());
			}
		};
		new Timer("Timer").schedule(task, 0, 100); // in milliseconds
	}

	private static long lastExecutionTime = 0;

	public synchronized static void applyChange(int addhunger, int addmood) { ///////// static void applyChange
		long currentTime = System.currentTimeMillis();

		// 如果距离上次执行时间超过五秒钟，则执行函数
		if (currentTime - lastExecutionTime > 5000) {
			System.out.println("Change applied.");
			lastExecutionTime = currentTime;

			if (health + addhunger < 100) {
				health = health + addhunger;
			} else {
				health = 100;
			}
			if (happiness + addmood < 100) {
				happiness = happiness + addmood; ///// happiness + addhunger -> happiness + addmood
			} else {
				happiness = 100;
			}
		} else {
			System.out.println("Cannot apply another change within five seconds.");
		}
	}
	public static void main(String[] args) {
		index i = new index(100,100);
		i.applyChange(10, 10);
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("health: " + health);
			System.out.println("happiness: " + happiness);
		}
	}
}

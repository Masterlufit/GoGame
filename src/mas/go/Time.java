package mas.go;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
	public void timer() {
		Timer t = new Timer();

		// Every Second
		t.scheduleAtFixedRate(new TimerTask() {
			public void run() {

			}
		}, 0, 1000);

		// Every Minute
		t.scheduleAtFixedRate(new TimerTask() {
			public void run() {

			}
		}, 0, 60 * 1000);
	}
}

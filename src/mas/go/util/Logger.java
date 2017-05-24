package mas.go.util;

import java.util.ArrayList;

public class Logger {
	private ArrayList<String> logs;

	public Logger() {
		logs = new ArrayList<>();
	}

	public void error(String msg) {
		logs.add("Error > " + msg);
		printLatestLog();
	}

	public void info(String msg) {
		logs.add("Info > " + msg);
		printLatestLog();
	}

	public void gameplay(String msg) {
		logs.add("Game > " + msg);
		printLatestLog();
	}

	public void warn(String msg) {
		logs.add("Game > " + msg);
		printLatestLog();
	}

	public void illegal(String msg) {
		logs.add("Illegal > " + msg);
		printLatestLog();
	}

	public void printLatestLog() {
		String latest = logs.get(logs.size() - 1);
		if (latest.startsWith("Error") || latest.startsWith("Illegal")) {
			System.err.println(latest);
		} else {
			System.out.println(latest);
		}
	}

	public ArrayList<String> getLogs() {
		return this.logs;
	}
}

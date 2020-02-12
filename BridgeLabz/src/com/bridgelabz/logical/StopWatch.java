package com.bridgelabz.logical;
public class StopWatch {
	static long timeMillis;
	public StopWatch() {
		timeMillis = System.currentTimeMillis();
	}
	public static long timeElapsed() {
		long millis = System.currentTimeMillis();
		long time_elapsed = millis - timeMillis;
		return time_elapsed;
	}
}
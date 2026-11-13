package part3_Threads;

import java.util.Random;

public class Horse implements Runnable {
	private String name;
	private FinishingLine finishingLine;
	private int distance;
	private Random random = new Random();

	public Horse(String name, FinishingLine f, int distance) {
		this.name = name;
		this.finishingLine = f;
		this.distance = distance;
	}
}

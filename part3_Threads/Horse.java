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

	@Override
	public void run() {
		System.out.println(name + ": " + distance + " meters to finish");

		while (distance > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}

			int step = random.nextInt(20) + 1;
			distance -= step;

			if (distance > 0) {
				System.out.println(name + ": " + distance + " meters to finish");
			}
		}

		finishingLine.arrive(this);
	}

	public String getHorseName() {
		return name;
	}
}

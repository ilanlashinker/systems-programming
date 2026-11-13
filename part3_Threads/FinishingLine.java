// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

package part3_Threads;

public class FinishingLine {
	private int place = 0;

	public synchronized void arrive(Horse horse) {
		place++;
		if (place == 1) {
			System.out.println("*******************************");
			System.out.println("====>" + horse.getHorseName() + " finished first!");
			System.out.println("*******************************");
		} else {
			System.out.println("====> " + horse.getHorseName() + " finished on " + place + "-th place");
		}
	}
}

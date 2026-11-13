
// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

package part3_Threads;

import java.util.Scanner;

public class HorseRace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance: ");
        int distance = sc.nextInt();

        FinishingLine f = new FinishingLine();

        String[] horsesNames = {"One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        for(String name : horsesNames){
            Horse h = new Horse(name , f, distance);
            Thread t = new Thread(h);
            t.start();
        }
        
        sc.close();
    }
}


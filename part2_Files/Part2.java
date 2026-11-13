// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858

package part2_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Part2 {

    public static void main(String[] args) {
        try {
            Scanner sc1 = new Scanner(new File("part2_Files/CS.txt"));
            Scanner sc2 = new Scanner(new File("part2_Files/hedva.txt"));

            String firstName = sc1.next();
            String lastName = sc1.next();
            int id = sc1.nextInt();

            int hedvaid = sc2.nextInt();
            int hedvaFirstGrade = sc2.nextInt();
            int hedvaSecondGrade = sc2.nextInt();

            PrintWriter writer = new PrintWriter(new File("part2_Files/report.txt"));

            boolean hasMorecs = true;
            boolean hasMorehedva = true;

            while (hasMorecs && hasMorehedva) {
                if (id == hedvaid) {
                    int avg = (hedvaFirstGrade + hedvaSecondGrade) / 2;
                    writer.println(id + " " + firstName + " " + lastName + " " + avg);
                    if (sc1.hasNext()) {
                        firstName = sc1.next();
                        lastName = sc1.next();
                        id = sc1.nextInt();
                    } else {
                        hasMorecs = false;
                    }
                    if (sc2.hasNext()) {
                        hedvaid = sc2.nextInt();
                        hedvaFirstGrade = sc2.nextInt();
                        hedvaSecondGrade = sc2.nextInt();
                    } else {
                        hasMorehedva = false;
                    }/////

                } else if (id < hedvaid) {
                    if (sc1.hasNext()) {
                        firstName = sc1.next();
                        lastName = sc1.next();
                        id = sc1.nextInt();
                    } else {
                        hasMorecs = false;
                    }
                } else {
                    if (sc2.hasNext()) {
                        hedvaid = sc2.nextInt();
                        hedvaFirstGrade = sc2.nextInt();
                        hedvaSecondGrade = sc2.nextInt();
                    } else {
                        hasMorehedva = false;
                    }
                }
            }

            writer.close();
            sc1.close();
            sc2.close();

        } catch (FileNotFoundException e) {
            System.out.println("קובץ לא נמצא: ");
        }

    }

}

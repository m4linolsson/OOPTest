import java.util.Random;
import java.util.Scanner;

public class PracticeArchery {
    // 5 omgångar med 3 pilar vardera

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    private static double point = random.nextDouble() * 10;
    private static int pointInt = (int) point;
    private static int archerypoint;
    private static int pointTotal;
    private static int numberOfHits;


    public static double getPoint() {

        return point;
    }

    public static void setPoint(double point) {

        point = random.nextDouble();
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public int getPointTotal() {
        return pointTotal;

    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        PracticeArchery.scanner = scanner;
    }

    public static int getArcherypoint() {
        return archerypoint;
    }

    public static void setArcherypoint() {
        archerypoint = scanner.nextInt();
        if (archerypoint < 0 || archerypoint > 10) {
            System.out.println("error false point");
            archerypoint = 0;
        } else
            archerypoint = archerypoint;
    }

    public static void resultsFromPracticeWhitGetterSetter(Employee employee) {
        System.out.println("Enter score for each arrow (0-10)");

        for (int i = 0; i < 5; i++) {
            setArcherypoint();

            pointTotal += getArcherypoint();

            if (getArcherypoint() != 0) {
                numberOfHits += 1;
            }
        }

        System.out.println("Number of hits; " + numberOfHits);
        System.out.println("Total points; " + pointTotal);

    }

    public static void resultsFromPracticeRandom(Employee employee) {

        for (int i = 0; i < 5; i++) {

            double points = random.nextDouble() * 10;
            int point = (int) points;


            pointTotal += point;

            if (getArcherypoint() != 0) {
                numberOfHits += 1;
            }
        }

        System.out.println("Number of hits; " + numberOfHits);
        System.out.println("Total points; " + pointTotal);
    }


    //   static public void resultsFromPractice(Employee employee) {
    //        System.out.println("Enter score for each arrow (0-19)");
    //
    //        //kanske kan sätta en gräns här mha getter och setter...
    //        //boolean vid någon points??
    //        //ha scanner som en imparameter??
    //
    //        for (int i = 0; i < 5; i++) {
    //            point = scanner.nextInt();
    //
    //            pointTotal += point;
    //
    //            if (point != 0) {
    //                numberOfHits += 1;
    //            }
    //        }
    //
    //        System.out.println("Number of hits; " + numberOfHits);
    //        System.out.println("Total points; " + pointTotal);
    //    }


}

package AssessentBasicProgramming;

import java.util.Scanner;
import java.lang.Math;


public class HealthyHearts {
    public static void main(String[] args) {
        // user inputs age
        Scanner heartRate = new Scanner(System.in);
        System.out.println("What is your age? ");

        // string input converted to integer
        String heartRateNum = heartRate.nextLine();
        int heartRateNumIn = Integer.parseInt(heartRateNum);

        // max heart rate calculated
        int maxHeartRate = 220-heartRateNumIn;

        // max heart rate printed to console
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");

        // target heart rate range calculated
        double lowHeartRate = maxHeartRate*0.50;
        long lowerHeartRate = Math.round(lowHeartRate);
        double highHeartRate = maxHeartRate*0.85;
        long higherHeartRate = Math.round(highHeartRate);

// target heart rate zone shown in console
        System.out.print("Your target HR zone is " + lowerHeartRate + "-"+ higherHeartRate + " beats per minute.");
    }
}

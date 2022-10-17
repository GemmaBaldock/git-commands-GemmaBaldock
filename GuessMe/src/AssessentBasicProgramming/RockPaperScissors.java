package AssessentBasicProgramming;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        // User inputs a number for rounds to play
        Scanner numRounds = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        String numOfRounds = numRounds.nextLine();
        int roundTotal = Integer.parseInt(numOfRounds);
        // user can input value between 1 and 10 only
        if (roundTotal < 1  || roundTotal > 10) {
            System.out.println("Outside of range");
            System.exit(0);
        }
        System.out.println("Number of rounds: " + roundTotal);

        // initialising the score counters
        int tie = 0;
        int userWin = 0;
        int machineWin = 0;


        while (roundTotal > 0) {
    { // user inputs number to choose from rock, paper or scissors
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number for rock (1), paper (2) or scissors (3): ");
        String userInputDecision = userInput.nextLine();
        // string input converted to integer
        int userDecision = Integer.parseInt(userInputDecision);

        // prints out user choice
        if (userDecision == 1) {
            System.out.print("User: Rock \n");
        }
        if (userDecision == 2) {
            System.out.print("User: Paper \n");
        }
        if (userDecision == 3) {
            System.out.print("User: Scissors \n");
        }
// random integer between 1 and 3
        Random rand = new Random();
        int ranNum = 1 + rand.nextInt(4);


        if (ranNum == 1) {
            System.out.print("Machine: Rock \n");
        } else if (ranNum == 2) {
            System.out.print("Machine: Paper \n");
        } else if (ranNum == 3) {
            System.out.print("Machine: Scissors\n");
        }

// if difference between values is 0, tie
        if (userDecision - ranNum == 0) {
            System.out.println("TIE \n");
            tie = tie + 1;
            // two consecutive numbers, highest number wins
        } else if (userDecision - ranNum == 1) {
            System.out.println("USER win \n");
            userWin = userWin + 1;
        } else if (ranNum - userDecision == 1) {
            System.out.println("MACHINE win \n");
            machineWin = machineWin + 1;
            // two non-consecutive numbers, lowest number wins
        } else if (userDecision - ranNum == 2) {
            System.out.println("MACHINE win \n");
            machineWin = machineWin + 1;
        } else if (ranNum - userDecision == 2) {
            System.out.println("USER win \n");
            userWin = userWin + 1;

        }

// number of rounds left to play
        roundTotal = roundTotal - 1;
        System.out.println("Machine win: " + machineWin + "\n User win: " + userWin + "\n Tie: " + tie);
// prints to console overall winner
        if (machineWin - userWin > 0)
            System.out.println("Machine is the overall WINNER");
        else if (machineWin - userWin < 0)
            System.out.println("User is the overall WINNER");
        else
            System.out.println("It's a draw");


        }





















    }
}}
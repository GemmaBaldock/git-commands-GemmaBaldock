package AssessentBasicProgramming;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {

        // user inputs dog name
        Scanner dog = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogName = dog.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + "'s background is: \n");

        // initialise random variable between 0 and 100

        Random dogBreed = new Random();



// random percentages for each dog calculated
        int dog1 = dogBreed.nextInt(101);

        int dog2 = dogBreed.nextInt(101-dog1);

        int dog3 = dogBreed.nextInt(101-dog1-dog2);

        int dog4 = dogBreed.nextInt(101-dog1-dog2-dog3);

        int dog5 = dogBreed.nextInt(101-dog1-dog2-dog3-dog4);

// prints to console breed percentages
        System.out.println(dog1 + "% St. Bernard");
        System.out.println(dog2 + "% Chihuahua");
        System.out.println(dog3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(dog4 + "% Common Cur");
        System.out.println(dog5 + "% King Doberman \n");

        System.out.print("Wow, that's QUITE the dog.");

        System.out.println("TOTAL: " + (dog1 + dog2 + dog3 + dog4 + dog5));
    }
}

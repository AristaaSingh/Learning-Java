// Section 2 Program 9
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        // creating a scanner instance that reads from System.in
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("What is your name?");
        String name = scanner.nextLine(); // wait for user to enter the next line (string)
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;

        // close the scanner after its use is finished.
        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you " + name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) + " on food");

    }
}

/**
 * NOTES
 * 
 * - Scanner is a class. To use, create an instance.
 * - nextInt, nextLong, nextDouble read int, long, and double types respectively.
 * - next reads the next word but stops the moment a whitespace is encountered.
 * - nextLine reads an entire line of data, including whitespaces.
 */
// Section 2 Program 7

public class MathOperations {
    public static void main(String args[]) {

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L;
        long starsInAndromeda = 1_000_000_000_000L;

        double testScore = 6.7;

        /* ADDITION */
        // if not enclosed in brackets, it just concatenated the numbers like strings
        System.out.println("Fred and George collected " + bagOfSweets1 + bagOfSweets2 + " sweets");
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        
        /* SUBTRACTION */
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");

        /* MULTIPLICATION AND DIVISION */
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.25) + " /10");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2.0) );

        /* REMAINDER (MODULUS) */
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10.0 % 2.0) );
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5.0 % 2.0) );

        /* ADD 1 (++) and SUBTRACT 1 (--) */
        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("Counter is: " + counter);
        counter--;
        counter--;
        counter--;
        System.out.println("Counter is: " + counter);

        /**
         * add by value to the right: +=
         * subtract by value to the right: -=
         */

    }
}
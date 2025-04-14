// Section 2 Program 10
import java.util.Scanner;

public class NextLineTrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nextInt() example
        System.out.print("\nEnter your age, your friend's age, and your parent's age: ");
        int yourAge = scanner.nextInt();
        int friendAge = scanner.nextInt();
        int parentAge = scanner.nextInt();
        scanner.nextLine(); // throwaway scanner nextline for the empty space left out by the last nextInt.

        System.out.println("Ages: You - " + yourAge +", Friend - " +friendAge +", Parent - " + parentAge);

        System.out.print("\nEnter a greeting: ");
        String greeting = scanner.nextLine();

        System.out.println("Greeting: " + greeting);

        // nextDouble() example
        System.out.print("\nEnter the price of a book, a coffee, and a meal: ");
        double bookPrice = scanner.nextDouble();
        double coffeePrice = scanner.nextDouble();
        double mealPrice = scanner.nextDouble();
        scanner.nextLine(); // throwaway scanner nextline for the empty space left out by the last nextDouble.


        System.out.println("Prices: Book - " + bookPrice + ", Coffee - " + coffeePrice + ", Meal - " + mealPrice);

        System.out.print("\nEnter a restaurant name: ");
        String restaurant = scanner.nextLine();

        System.out.println("Restaurant: " + restaurant);

        // nextLong() example
        System.out.print("\nEnter the population of three cities: ");
        long city1Population = scanner.nextLong();
        long city2Population = scanner.nextLong();
        long city3Population = scanner.nextLong();
        scanner.nextLine(); // throwaway scanner nextline for the empty space left out by the last nextLong.


        System.out.println("Populations: City 1 - " + city1Population + ", City 2 - " + city2Population + ", City 3 - " + city3Population + "\n");

        System.out.print("\nEnter the name of the most populous city: ");
        String cityName = scanner.nextLine();

        System.out.println("Most populous city: " + cityName);

        // next() example
        System.out.print("\nEnter three colors: ");
        String color1 = scanner.next();
        String color2 = scanner.next();
        String color3 = scanner.next();
        scanner.nextLine(); // throwaway scanner nextline for the empty space left out by the last next.

        System.out.println("Colors: 1 - " + color1 + ", 2 - " + color2 + ", 3 - " + color3 +"\n");

        System.out.print("\nEnter your favorite color combination: ");
        String colorCombination = scanner.nextLine();
        System.out.println("Favorite color combination: " + colorCombination);

        scanner.close();
    }
}

/**
 * NOTES
 * 
 * - the nextLine trap occurs when a nextLine is placed after a next, nextInt, nextLong or nextDouble
 * - each of the four leave out the remaining whitespace in the line after scanning for their respective type
 * - and the nextLine right after them scans that whitespace since it's where the scanner's pointer was left off.
 */

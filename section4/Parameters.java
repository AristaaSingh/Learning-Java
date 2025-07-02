// section 4 program 2
import java.util.Scanner;

public class Parameters {
    public static void main(String args[]) {

        // open scanner obj
        Scanner scan = new Scanner(System.in);

        // get params from user
        System.out.println("Hey! We're gonna calculate the area of a rectange.");
        System.out.println("What's the length?");
        double length = scan.nextDouble();
        System.out.println("Great, what's the width?");
        double width = scan.nextDouble();

        // call the function
        double area = calculateArea(length, width);
        System.out.println("The area is " + area + " sq units.");

    } 

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
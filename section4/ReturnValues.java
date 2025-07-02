// section 4 program 3

public class ReturnValues {
    public static void main(String args[]) {
        double area = calculateArea(10.6, 6.4);
        System.out.printf("The area is %f sq units\n", area);
    }

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"
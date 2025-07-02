// section 4 program 3

public class ReturnValues {
    public static void main(String args[]) {
        double area = calculateArea(10.6, 6.4);
        System.out.printf("The area is %f sq units\n", area);

        String explanation = explainArea("English");
        System.out.println(explanation);
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid dimensions!");
            System.exit(0); 
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch(language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not found.";
        }
    }
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"
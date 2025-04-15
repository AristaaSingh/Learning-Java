// Workbook 3.3

public class Championship {
    public static void main(String[] args) {

        int gryffindor = 10;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor comes first!");
        } else if (margin >= 0) {
            System.out.println("Gryffindor comes second.");
        } else if (margin >= -100) {
            System.out.println("Gryffindor comes third.");
        } else {
            System.out.println("Gryffindor comes fourth");
        }
        
    }
}
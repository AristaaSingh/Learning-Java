// Section 3 Program 3

public class IfElse {
    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        if (biologyGrade > chemistryGrade) {
            System.out.println("JavaBuddy: Yes u did! :]");
        } else {
            System.out.println("JavaBuddy: No u didn't :[");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        if (sales > costs) {
            System.out.println("JavaBuddy: Yes, make it rain!");
        } else {
            System.out.println("JavaBuddy: No... might wanna cut down on the rations.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        if (temperature < targetTemperature) {
            System.out.println("JavaBuddy: Brrr, yes put a jacket on!");
        } else {
            System.out.println("JavaBuddy: Nope, all good!");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        if (currentSpeed < speedLimit) {
            System.out.println("JavaBuddy: Yes, good job!");
        } else {
            System.out.println("JavaBuddy: No, slow down!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        if (age >= retirementAge) {
            System.out.println("JavaBuddy: Yes, time for a vacation! :]");
        } else {
            System.out.println("JavaBuddy: Not yet, keep working!");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        if (myGrade == bestGrade) {
            System.out.println("JavaBuddy: Yes, well done!");
        } else {
            System.out.println("JavaBuddy: No, better luck next time :[");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        if (word.equals(secondWord)) {
            System.out.println("JavaBuddy: Yep!");
        } else {
            System.out.println("JavaBuddy: Nope!");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        if (!thirdWord.equals(fourthWord)) {
            System.out.println("JavaBuddy: Yep!");
        } else {
            System.out.println("JavaBuddy: Nope!");
        }
    }
}

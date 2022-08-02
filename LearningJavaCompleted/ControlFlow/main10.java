import java.util.Scanner;

public class Main {
    public static void  main(String args[]) {
        String question = "Did you recycle the trash today?";
        String choiceOne = "yes";
        String choiceTwo = "maybe";
        String choiceThree = "no";

        String correctAnswer = choiceOne;

        System.out.println(question);
        System.out.println("Choose one from the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if (correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Congrats, you remember!");
        }

        else {
            System.out.println("Come back when it's done");
        }

    }
}


import java.util.Scanner;

public class CodeChallenge01 {
    public static void main(String args[]) {
        String question = "Who's the hero that saves Zelda?";
        String choiceOne = "Mario";
        String choiceTwo = "Link";
        String choiceThree = "Simon";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + " , " + choiceTwo + " , or " + choiceThree + ".");
        try (// Have the user input an answer
        Scanner input = new Scanner(System.in)) {
            // Retrieve the user's input
            String userInput = input.next();

            // If the user's input matches the correctAnswer...
            if(correctAnswer.equals(userInput.toLowerCase())) {
                // then the user is correct and we want to print out a congrats message to the user.
                System.out.println("You are correct!!");
            }else {
                // If the user's input does not match the correctAnswer...
                    // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
                    System.out.println("You are wrong. The answer is: " + correctAnswer);

            }
        }
    }
}


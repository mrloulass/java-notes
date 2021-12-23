import java.util.Scanner;

public class Loop_02 {
    public static void main(String[] args) {
        try(Scanner inputFromUser = new Scanner(System.in)){
            boolean isDancing = true;
            while(isDancing){
                System.out.println("You are dancing to this song.");
                System.out.println("Are you done dancing? If so, answer yes");
                String userInputAnswer = inputFromUser.next();

                if(userInputAnswer.equals("yes")) {
                    isDancing = false;
                }
            }
            System.out.println("Please, take a sit and rest");
        }
    }
}

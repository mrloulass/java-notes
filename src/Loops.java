import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        While Loops
        try(Scanner input = new Scanner(System.in)) {
            boolean isOnRepeat = true;
            while(isOnRepeat){
                System.out.println("Playing current song");
                System.out.println("Would you like to take this song oof repeat? If so, answer yes");
                String userInput = input.next();

                if(userInput.equals("yes")){
                    isOnRepeat = false;
                }
            }
            System.out.println("Playing Next song");
        }
    }
}

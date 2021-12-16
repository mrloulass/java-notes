import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        System.out.println("Hello World from the Intellij IDE!");

 /*    Classifying Data
    Student's age represented with an int
    Student's GPA represented with a double
    Student's first initial will be represented with a char
    Student's last initial will be represented with a char
    Student's perfect attendance will be represented with a Boolean

        int studentAge = 15;
        double studentGPA = 3.5;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "John";
        String studentLastName = "Smith";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");

        try(Scanner input = new Scanner(System.in)) {
           studentGPA = input.nextDouble();
        };
        try(Scanner inputTwo = new Scanner(System.in)) {
           studentAge = inputTwo.nextInt();
        };
        System.out.println(studentFirstName + " " + studentLastName + " " + "now has a GPA of " + studentGPA);
        System.out.println(studentFirstName + " " + studentLastName + " " + "age is " + studentAge);

  */
/*     Start => Pick a number between 1 and 10
        if inputtedNum is less than five
            Print Enjoy the good luck a friend brings you
        if inputtedNum is equal or greater than five
            Print Your shoe selection will make you happy today
  */
        System.out.println("Pick a number between 1 and 10");
        try (Scanner scanner = new Scanner(System.in)) {
          int inputtedNum = scanner.nextInt();
        
          if(inputtedNum < 5){
              System.out.println("Enjoy the good luck a friend brings you");
          }else {
              System.out.println("Your shoe selection will make you happy today");
          }
        }
  }
}

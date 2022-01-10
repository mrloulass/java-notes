# java-notes

## Java Programs
- Java can be used to build:
  - Web applications
  - Mobile applications
  - Desktop applications
  - Web servers
  - Embedded systems

## Java Development Kit (JDK)
- use for building and developing Java applications 
- Includes the JRE and other tools to create Java programs

### Java Runtime Environment (JRE)
- use for running Java applications 
- has Libraries and classes
- JVM Java Virtual Machine

#### Java Virtual Machine (JVM)
- execute Java programs

## Running Java code
- 1st: need to complied Java source code to Java byte code `javac Filename.java`
- 2nd: to run the code `java FileName`
- Anytime you change the source code you need to complied the code before you run the code.

## Integrated Development Environment (IDE)
- is a software we can use to build and run Java programs 
- Built for compiling and executing code
- has a Graphical User Interface (GUI)
- Contains built-in tools to make the development process faster
- Example: 
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)
  - [NetBeans](https://netbeans.apache.org/)

### Input/Output
- Output using `System.out.println()` to the console
- Input using `Scanner input = new Scanner(System.in)` this allow the user to input information to the console;
  - Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings.

## Control Flow
- A program's control flow is the order in which the program's instructions or code statements are executed.

### Operators in Java
- Relational Operators
  - less than `<`
  - greater than `>`
  - equal to `==`
  - greater than or equal to `>=`
  - less than or equal to `<=`
  - not equal to `!=`

### Decision- making with if statement in Java
- An if statement is a control flow statement, where if the condition is true, it performs some kind of action

### Understanding scope in Java
- The scope of a variable is the part of the program where a piece of code is accessible or in which it can be used
- Curly braces `{}` create different blocks or regions in Java
### While Loop
- A while loop allows code to be executed repeatedly based on a Boolean condition

## Debugging in Java
- involves locating and fixing a program's errors (bugs)

### Print Statement
- use print statements to print  the value of a given variable and follow the control flow of a code

### Syntax Errors
- are misspelled variable or missing semicolon
- can cause your code to fail before it runs
- the code must be in the right format for a computer to read

### Logical Errors
- deal with the logic of a program
- the program doesn't act as the user expects

### IDE: Integrated Development Environment
- helps compile and run Java programs
- helps debug Java programs by detecting and revealing errors
  - Breakpoints: an intentional stopping point put into a program for debugging purposes. This allow us to inspect its internal state
    - click the line of code number and run the code in debug mode
    - internal state: variable values, the result of certain lines of code is executed ot not

## Package
- organizing and group your classes together

## Comments
- single line uses `//` in the begin
- multi line uses `/*can add multi comments between */`

## Variables
- is a box that store data types

## Data Types

### Primitive Types

- Boolean: represent a true or false value (Ex: Is a light on or off)
- Int: represent a whole number (Ex: number of siblings)
- Double: represent a decimal number (Ex: your GPA 3.3)
- Char: represent a single letter or symbol (Ex: your First initial)

### Reference Types

- String: a sequence of ordered characters (Ex: a word or person's name) or built out of characters
  - String value: will have quotation marks around it (`"speaker"`)
  - String variable: `string myFavoriteWord = "speaker"`
  - String operation:
    - charAt: is a special string operation that allows us to access a character at a specific location within the string
      - `variable.charAt(index)`
      - Input: index of the wanted character
      - Output: the value of the character at the inputted index

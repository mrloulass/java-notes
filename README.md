# java-notes

## Java Programs
- Java can be used to build:
  - Web applications
  - Mobile applications
  - Desktop applications
  - Web servers
  - Embedded systems

## Java Runtime Environment (JRE)
- use to run Java applications 

## Java Development Kit (JDK)
- use to build and develop Java applications 
- Includes the JRE and other tools to create Java programs

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
### While loops

import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA
{
    Scanner scanner = new Scanner(System.in);
    int age;
    int LOWER_BOUND = 0;
    boolean shouldContinue = true;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
      while (shouldContinue) {
       System.out.println("How old are you?");
       try {
           age = scanner.nextInt();
           System.out.println(age);
       } catch (InputMismatchException error) {
           System.out.println("Please enter an integer");
           scanner.next();
       }
       if (age < LOWER_BOUND && age != 0) {
        System.out.println(age+" is too young!!");
        } else if(age==0) {
            System.out.println("end of program");
            shouldContinue = false;
        } else {
        System.out.println("Computations go here");                
        }
    }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

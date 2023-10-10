import java.util.InputMismatchException;
import java.util.Scanner;

public class Week6 {

    static void example1(){

        Integer.parseInt("abc");
        System.out.println("hello world");

    }
    static void example2(){

        System.out.println("hello");
        System.out.println("world");

        try{
            /*
                    user input
                    open a resource
                    conversion method
             */
            int a = 10, b=20;
            int c = a + b / 2;

            Integer.parseInt("abc");
            System.out.println("hello world- line 24");

//list of exception: Exception
        }
        catch (Exception e){
            //serr+tab

            //exceptions have NAME, possible Message

            System.err.print(e.getClass().getName() + " : ");
            System.err.println(e.getMessage());
        }

        System.out.println("Good");
        System.out.println("Bye");

    }
    static void example3(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter number 1: ");
            int a = input.nextInt();
            System.out.println("Enter number 2: ");
            int b = input.nextInt();
            System.out.printf("The sum of %d and %d = %d%n", a, b, a+b);

        }
        catch (Exception e){
            System.err.print(e.getClass().getName() + ": ");
            System.err.println(e.getMessage());
        }
        finally{
            System.out.println("Thanks for using our program");
        }

    }
    static void example4(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");

        try{
            int z = Integer.parseInt("abc");

            System.out.println("Enter number 1: ");
            int a = input.nextInt();
            System.out.println("Enter number 2: ");
            int b = input.nextInt();
            System.out.printf("The sum of %d and %d = %d%n", a, b, a+b);


        }
        catch (NumberFormatException e){
            System.err.println("Cannot convert!");
        }
        catch (InputMismatchException e){
//            System.err.print(e.getClass().getName() + ": ");
//            System.err.println(e.getMessage());
            System.out.println("Please enter a valid integer value");

        }
        finally {
            System.out.println("Thanks for using our program");

        }
    }
    static void example5(){

        /*
        Ask the user for two numbers.
        Determine the sum, difference, product and quotient of numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our math program");
        System.out.println("You are going to enter two number and we will compute " +
                "the sum, difference, product and quotient of the two numbers");

        try{
            System.out.println("Enter first number");
            int num1 = input.nextInt();
            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.printf("Two numbers are %d and %d. " +
                    "The sum is %d, difference is %d, product is %d and quotient is %.2f%n",
                    num1, num2, num1 + num2, num1 - num2, num1 * num2, (double)num1 / num2
                    );
        }
        catch (InputMismatchException | ArithmeticException e){
            System.err.println("Invalid integer value or arithmetic error occurred");
        }
        finally {
            System.out.println("Thanks for using our program");
        }


    }
    static void example6(){

        System.out.println("Enter two even numbers greater than zero");
        Scanner input = new Scanner(System.in);
try {
    System.out.println("Enter first number");
    int num1 = input.nextInt();
    System.out.println("Enter second number");
    int num2 = input.nextInt();

    if(num1 % 2 != 0 || num1 <= 0 )
        throw new IllegalArgumentException("Number " + num1 + " is not even or not greater than zero");
    else if(num2 % 2 != 0 || num2 <= 0 )
        throw new IllegalArgumentException("Number " + num2 + " is not even or not greater than zero");

    System.out.printf("Your entered numbers %d and %d%n", num1, num2);
}
catch (InputMismatchException e){
    System.err.println("Invalid number");
}
catch (IllegalArgumentException e){
    System.err.println(e.getMessage());
}

    }

    /**
     *
     * @throws InputMismatchException
     * @throws IllegalArgumentException
     */
    static void example6_1() throws InputMismatchException, IllegalArgumentException{

        System.out.println("Enter two even numbers greater than zero");
        Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            int num1 = input.nextInt();
            System.out.println("Enter second number");
            int num2 = input.nextInt();

            if(num1 % 2 != 0 || num1 <= 0 )
                throw new IllegalArgumentException("Number " + num1 + " is not even or not greater than zero");
            else if(num2 % 2 != 0 || num2 <= 0 )
                throw new IllegalArgumentException("Number " + num2 + " is not even or not greater than zero");

            System.out.printf("Your entered numbers %d and %d%n", num1, num2);


    }
    static void example7(){

        Car car = new Car("ab");
        System.out.println(car);
    }
    static void example8() throws InputMismatchException
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("Number was " + num);

    }
    static void example9(){

        try{
            example8();
        }
        catch (InputMismatchException e){
            System.err.println("Invalid number");
        }

    }
    static void example10(){
        example1();
    }
    public static void main(String[] args) {

        example10();
    }
}

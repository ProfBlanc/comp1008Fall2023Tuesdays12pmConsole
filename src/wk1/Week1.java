package wk1;

import java.util.Scanner;

public class Week1 {


    //psvm+tab
    public static void main(String[] args) {

        /*
        ask user for name, age, address
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Enter age");
        byte age = input.nextByte();
        input.nextLine();
        System.out.println("Enter address");
        String address = input.nextLine();

        System.out.println("Name is " + name + ". Age is " + age + ". Address is " + address);

        //Console.WriteLine($"Name is {}. Age is {}. Address is {}", name, age, address);

        //souf+tab
        System.out.printf("Name is %s. Age is %d. Address is %s", name, age, address);
        /*
        %
            s
            d
            f
            ex  %s
                %d
                %f
         */





    }

    static void example2(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old");

    }

    static void example1(){
        Home home = new Home();

        //sout+tab
        System.out.println("Hello World");

        System.out.println("Input Name");
        Scanner input = new Scanner(System.in);
        String name = input.next();  //next(), nextLine

        System.out.println("Hello, " + name);

    }

}

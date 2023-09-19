package wk3;
import java.util.Scanner;

public class Week3{
    
    public static void main(String[] args){
     
     //array: collections of values
     
     Car[] cars = {new Car("Honda", "Civic", (short)2000), new Car("GMC", "Yukon", (short)2021), null, null  };
     
     System.out.println(cars[0]);
     System.out.println(cars[1]);
     
     Scanner input = new Scanner(System.in);
        
        System.out.println("Enter make");
        String make1 = input.nextLine();

        System.out.println("Enter model");
        String model1 = input.nextLine();
        
        System.out.println("Enter year");
        short year1 = input.nextShort();
        
        cars[2] = new Car(make1, model1, year1);
        
        System.out.println(cars[2]);
        
        //multi-dimensinal array
        //tabular data
        
        /*
                     Tuesday             Wednesday
                
            css         java                python
            php            database            co-op
        
        */
        
        String[][] courses1 = { {"css", "php"} , {"java", "databases"}, {"python", "co-op"}    };
        

        
        
        for(int i = 0; i < courses1.length; i++){
            for(int j = 0; j < courses1[i].length; j++){
                System.out.println(courses1[i][j]);
            }
        }
    }
}

class SeasonCoat{
    
    //private String season;
    //private String month;
    
    
    //enum: enumerable : preset list of values
    //enum a list of constant values
    
    //to create enum
    //create the LIST of preset options
    //create an instance variable that will store one value from list above
    
    enum ListOfSeasons {WINTER, SPRING, SUMMER, FALL};
    
    //how do you create a instance variable again?
    //[access level]  -   data type   -   name    [= value]
    private ListOfSeasons season;
    
    public ListOfSeasons getSeason(){
        
        return season;
    }
    public void setSeason(String season){
        
        this.season = switch(season.toLowerCase()){
            default: yield ListOfSeasons.WINTER;
            case "winter": yield ListOfSeasons.WINTER;
            case "spring": yield ListOfSeasons.values()[1];
            case "summer": yield ListOfSeasons.SUMMER;
            case "fall": yield ListOfSeasons.values()[3];
            
        };
    }
    public void setSeason(ListOfSeasons season){
        this.season = season;
    }
    
    
    public SeasonCoat(){
        
        System.out.println(ListOfSeasons.WINTER);
    }
    
}

class Apple{
    //static, final
    static String someValue = "Ben";
    
   // static final String CREATOR = "Steve Jobs";
    final String CREATOR;
    
    public Apple(){
        
        CREATOR = "Steve Jobs";
    }
    
    String device;
    double version;
    
    static final String contactSupportEmail(String country){
        
        return switch(country){
            
            case "canada": yield "help@email.ca";
            case "usa": yield "help@email.com";
            default : yield "help@international.com";
        };
    }
    
    
    
}

class Cat{
    
    private String name;
    private int legs;
    private double weight;
    private boolean hasStripes;
    
    @Override
    public String toString(){
        
        return String.format("Cat{Name=%s, Legs=%d, Weight=%.1f}%n", name, legs, weight);
    }
    public Cat(){
        name = "Cat";
        legs = 4;
        weight = 50;
    }
    public Cat(String name, int legs, double weight){
        
        this.name = name; 
        this.legs = legs; 
        this.weight = weight;
    }
    public static Cat createLion(double weight){
        return new Cat("Lion", 4, weight);
    }
}

public class MyClass {
    
    static void example1(){
        
        int[] nums = {1, 2, 5, 10, 20};
        
        // for loop
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        
        
        
    }
    static void example2(){
        
                int[] nums = {1, 2, 5, 10, 20};
                
                //foreach loop => enhanced for loop
        
        //for(DataType placeHolderName : collectionOfValues)
        
        for(int currentNumber : nums){
            System.out.println(currentNumber);
        }

    }
    
    static void example3(){
        
        System.out.println(SeasonCoat.ListOfSeasons.WINTER);
        System.out.println(SeasonCoat.ListOfSeasons.values()[0]);
        SeasonCoat sc = new SeasonCoat();
        
       //sc.season = SeasonCoat.ListOfSeasons.WINTER;
        //System.out.println(sc.season);
        sc.setSeason("sUmmER");
        System.out.println(sc.getSeason());
        sc.setSeason(SeasonCoat.ListOfSeasons.FALL);
        System.out.println(sc.getSeason());
        System.out.println("*".repeat(20));
        for(SeasonCoat.ListOfSeasons currentSeason : SeasonCoat.ListOfSeasons.values() ){
            
            System.out.println(currentSeason);
        }
       
    }
    
    static void example4(){
        
        System.out.println(Apple.someValue); //Ben
        Apple.someValue = "Blanc";
        System.out.println(Apple.someValue); //Blanc
        
        System.out.println(Apple.contactSupportEmail("canada"));
        
    }
    static void example5(){
        
        Cat lion = Cat.createLion(80);
        System.out.println(lion);
        Cat c1 = lion.createLion(10);
        System.out.println(c1);
    }
    static void example6(){
        String s = "Hello";
        s = "World";
        s = "Java";
        s = "boo";
        s = "hoo";
        s = "foo";
        s = "bar";
        
        String s1 = new String(); // unless
        String s2 = new String("Hello");
        String s3 = new String(new char[]{'h','i'});
        
        char[] letters = s2.toCharArray();
        for(char letter : letters){
            
            System.out.println(letter);
        }
        
        StringBuilder sb, sb1, sb2;
        sb = new StringBuilder();  //default capacity = 16
        sb.append("Hello");
        sb.setLength(0); // clear values
        sb.append("World");
        sb.setLength(0); // clear values
        sb.append("Java");
        
        sb1 = new StringBuilder(20);
        sb2 = new StringBuilder("Hello");  //length of string + 16
        
        sb1.append("Ben"); //length = 3, capacity=20
        sb1.append(" Blanc"); //length=9, capacity=20
        sb1.append("HelloWorld"); //length=19, capacity= 20
        sb1.append("!!");
        System.out.println(sb1.length() );
        System.out.println(sb1.capacity() );
        
        sb1.insert(0, "BB");
        //sb1 = ??? BBBen BlancHelloWorld!!
        sb1.deleteCharAt(4);
        //sb1 = ??? BBBe BlancHelloWorld!!
        sb1.delete(0,3);
        //sb1 = ??? e BlancHelloWorld!!    capacity?
        
        String sss = sb1.toString();
        
        
        //SeasonCoat sc = "Winter";
        
    }
    public static void main(String[] args) {
        example6();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class Shape{

    private int sides;
    private String name="Shape";
    double length, width, radius, diameter;
    
    public int getSides(){
        return sides;
    }
    public String getName(){
        return name;
    }
    public void setSides(int sides){
        this.sides = sides;
    }
    public void setName(String name){
        this.name = name;
    }
    public Shape(){}
    public Shape(String name, int sides){
        setName(name);
        setSides(sides);
    }
    public Shape(String name, int sides, double length, double with){
        setName(name);
        setSides(sides);
        this.length = length;
        this.width = width;
    }
    
    //abstract method
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract String coolMethod(int a, double b);
}

abstract class ThreeDShape extends Shape{}

class Rectangle extends Shape{
    
     @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (length + width);
    }
    @Override
    public String coolMethod(int a, double b){
        return a + "-" + b;
    }
    
}

interface Screen{
    //instance variables => mis nommer => constant
    int MAX_WIDTH = 1000, MAX_HEIGHT = 2000; 
    
    //what action(s) does this entity (Screen) NEED to implement?
    
    boolean isTooHot(double externalTemperature);
    /**
     * called when device needs to automatically shut down
     * @param statusCode status code of reason
     * @return a message of why screen shut dow
     */ 
    String autoShutDown(int statusCode);
    
}

interface Face{
    
    String VALUE = "Hello";
    
    void myMethod();
}

interface ISample1 extends Face{}


interface ISample2 extends Screen, Face{}


class SampleClass implements Screen, Face{
    @Override
    public void myMethod(){}
     @Override
    public boolean isTooHot(double externalTemperature){
        return false;
    }
    @Override
    public String autoShutDown(int statusCode){
        return "goodbye";
    }
}

class Cellphone extends Rectangle implements Screen{
    
    @Override
    public boolean isTooHot(double externalTemperature){
        return false;
    }
    @Override
    public String autoShutDown(int statusCode){
        return "goodbye";
    }
}


class HelloWorld {
    
    static void example1(){
        /*
        Poly morphism
            greek
                poly        many/multi
                morphism    forms/body
                
        Two's 
        
        
        Override
            is poly morphism
                why?
                    one class, it has one implementation
                    in another class, it has new implementation
        
        Overload
            is polymorphism
                why?
                    new variation = new way
        
        
        
        Objects are comprised of other entities (components)
        
        inner/internal components
            abstract classes
        outter/external components
            interfaces
        
        in Java you can create classes that are dedicated components aka dedicated super, parent, base class
        
        
        technical aspects of components mentioned above
        
        abstract class: aka dedicated super, parent, base class.
        It can look and feel like a Concrete class?
            instance variables, constants, (concrete/regular)methods
            cannot be instantied
            
            NEW: can be abstract method: method that needs to be implemented (write code body) BUT does not have a default behavior
            concrete class can extend only 1 other abstract class
                    concrete class MUST implement abstract methods if any
            abstract class can extend abstract
                do not need to implement abstracts methods
        
        
        interface
            list of requirements
                all entities public
            instance variables, methods
            externally seen components
            cannot instantied interface
            implement many interfaces
            extend an interface
        
        
        
        GAME
        
        Me: state an object
        You: would this be a concrete class, abstract class, interface
        
        
        Q1) Does this object exist by itself?
        Yes: concrete class
        No: Q2) Is this object an internal or external component of a bigger object
            Internal?: Abstract
            External?: Interface
            
            
    1) Human    2) Heart    3)Hair  Brain
    
    4)House     5)Apartment 6)Floor     7)Door
    
    Game part 2:
    
    Me: state a feature
    You: which entities can implment this feature
    
    instance variable: all
    constructor: CA
    method with NO default implementation: AI
    method WITH default method body: CA
        
        */
        
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

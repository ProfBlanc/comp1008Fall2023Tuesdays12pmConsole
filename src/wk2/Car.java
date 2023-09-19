package wk2;

class Car{
    /*
    attributes/chars of car
        how the object looks
    */
    
    private int speed;
    String color="black", make="honda", model="s2000";
    private short rpm, year=1990;
    
    
    //actions: 
    
    void increaseSpeed(int amountToIncreaseBy){
        if(amountToIncreaseBy >= 1 && amountToIncreaseBy <= 25){
            speed += amountToIncreaseBy;
        }
    }
    void decreaseSpeed(int amountToDecreaseBy){
        if(amountToDecreaseBy >= 1 && amountToDecreaseBy <= 25 && speed - amountToDecreaseBy >= 0){
            
            speed -= amountToDecreaseBy;
        }
    }
    void brake(){}
    boolean isEngineOn(){
        return rpm >= 10;
    }
    
    //getters and setters
    
    //getters
    public int getSpeed(){
        return speed;
    }
    public short getYear(){
        return year;
    }
    public short getRpm(){
        return rpm;
    }
    
    //setters
    public void setSpeed(int speed){
        if(speed >= -50 && speed <= 250){
        this.speed = speed;
        }
    }
    public void setYear(short year){
        if(year >=1990 && year <=2024)
            this.year = year;
    }
    public void setRpm(short rpm){
        if(rpm>= 0 && rpm <=10000)
            this.rpm = rpm;
            
    }
    
    //accessibility level
    /*
        controlling how accessible a value is
            1) Hide sensitive
            2) Restrict values
            
            private: only way to restrict values'
                only accessible inside class
                    create methods to change values
                        getters or setter
            public, protected, default (package-private)
                values are accessible w/i the same package
    */
    
    
    //a constructor: a special method: once creating the object
    //exception: no return data type. name same name as class
    public Car(){}
    
    public Car(String make){
        this.make = make;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }    
    //public Car(String model, String make){}  //illegal
    
    public Car(String make, String model, short year){
        this(make, model);
        this.year = year;
    }
    public Car(short year, String make, String model){
        this(make, model, year);
    }
    //unique method signature: method header : first line of method
    public Car(String make, short year, String model){
        this(make, model, year);
    }
    
    @Override
    public String toString(){
        return String.format("Make=%s,Model=%s,Color=%s,year=%d,rpm=%d,speed=%d", make, model, color, year, rpm,speed);
    }
}

package wk2;

public class Car{
    /*
    attributes/chars of car
        how the object looks
    */
    
    private int speed;
    String color="black", make="honda", model="s2000";
    private short rpm, year=1990;
    
    
    //actions: 
    
    void increaseSpeed(int amountToIncreaseBy){}
    void decreaseSpeed(int amountToDecreaseBy){}
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
    
    
}

public class Car {

    private String color = "black";
    public Car(){}
    public Car(String color){
        setColor(color);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        if(color.length() < 3)
            throw new IllegalArgumentException("Color length is too small. Needs to be at least 3 characters");
        this.color = color;
    }

    public String toString(){
        return "Car{color='"+color+"'}";
    }

}


package wk1;

public class Home {

    private int sqft;


    //package-private aka default
    protected float other;

    public byte last;
    double number;

    //public Sqft{ get;set;}

    public int getSqft(){
        return sqft;
    }

    public void setSqft(int sqft){
        this.sqft = sqft;
    }

}

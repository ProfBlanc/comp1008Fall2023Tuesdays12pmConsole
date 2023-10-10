public class House {

    private String address = "123 Main St";

    public House(){}
    public House(String address) throws Exception{
        setAddress(address);
    }
    public void setAddress(String address) throws Exception
    {
        if(address.length() < 10)
            throw new Exception("Address must be at least 10 characters");
        this.address = address;
    }

    public String toString(){
        return String.format("House{address='%s'}", address);
    }
}

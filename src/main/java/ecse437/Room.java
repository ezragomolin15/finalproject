package ecse437;
public class Room {
    private int price;
    private String location;
    
    public Room(int price, String location){
        this.price = price;
        this.location = location;
    }

    public int getPrice(){
        return this.price;
    }

    public String getLocation(){
        return this.location;
    }
}
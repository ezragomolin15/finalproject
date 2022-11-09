package ecse437;
public class Flight {
    private String locationFrom;
    private String locationTo;
    private String flightNumber;
    private int price;

    public Flight(String locationFrom, String locationTo, String flightNumber, int price){
        this.locationFrom = locationFrom;
        this.locationTo = locationTo;
        this.flightNumber = flightNumber;
        this.price = price;
    }
    

    public String getLocationFrom(){
        
        return "";
    }

    public String getLocationTo(){
        return this.locationTo;
    }

    public String getFlightNum(){
        return this.flightNumber;
    }

    public int getPrice(){
        return this.price;
    }


}
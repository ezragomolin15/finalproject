package ecse437;

public class Reservation {
    private Car car;
    private Flight flight;
    private Room room;
    private Restaurant restaurant;
    private String userId;

    public Reservation(String userId, Car car, Flight flight, Room room, Restaurant restaurant){
        this.car = car;
        this.flight = flight;
        this.room = room;
        this.userId = userId;
        this.restaurant = restaurant;
    }

    public int getPrice(){
        return this.car.getPrice() + this.flight.getPrice() + this.room.getPrice();
    }

    public String getUserId(){
        return this.userId;
    }

    public Car getCar(){
        return this.car;
    }

    public Room getRoom(){
        return this.room;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public Restaurant getRestaurant(){
        return this.restaurant;
    }

    
}


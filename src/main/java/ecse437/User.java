package ecse437;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userId;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public User(String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return this.userId;
    }

    public List<Reservation> getReservations(){
        return this.reservations;
    }

    public void addReservation(Car car, Flight flight, Room room, Restaurant restaurant){
        Reservation res = new Reservation(this.userId, car, flight, room, restaurant);
        this.reservations.add(res);
    }

    public int getBill(){
        int total = 0;
        for (int i=0; i<this.reservations.size(); i++){
            total=reservations.get(i).getPrice();
        }
        return total;
    }
    
    

    
}

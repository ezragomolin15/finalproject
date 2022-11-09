package ecse437;


import java.util.HashMap;
import java.util.Scanner;

public class App {
    
    public static HashMap<String, User> storedusers = new HashMap<String, User>();

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Welcome To Trip Manager!" );
        reserve();
        sc.close();
    }
        
        
public static void reserve(){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter User ID: ");
    String userId = sc.nextLine();
    User user = storedusers.get(userId);
      if(user==null){
        user = new User(userId);
        storedusers.put(userId, user);
      }
    System.out.println("");
    System.out.print("Enter Where You Are Departing From: ");
    String locationFrom = sc.nextLine();
    System.out.print("Enter Where You Are Flying To: ");
    String locationTo = sc.nextLine();
    System.out.print("Enter Flight Number: ");
    String flightNum = sc.nextLine();
    System.out.print("Enter Flight Price: ");
    int flightPrice = Integer.parseInt(sc.nextLine());
    //Create Car
    System.out.print("Enter Car Brand: ");
    String brand = sc.nextLine();
    System.out.print("Enter Car Model: ");
    String model = sc.nextLine();
    System.out.print("Enter Car Price: ");
    int carPrice = Integer.parseInt(sc.nextLine());
    //Create Room
    System.out.print("Enter Room Price: ");
    int roomPrice = Integer.parseInt(sc.nextLine());
    //Reserve Restaurant
    System.out.print("Enter Name of restaurant: ");
    String name = sc.nextLine();
    System.out.print("Enter Date of restaurant reservation: ");
    String date = sc.nextLine();
    System.out.print("Enter Number of people: ");
    int numPeople = Integer.parseInt(sc.nextLine());
    //Add Reservation
    Flight flight = new Flight(locationFrom, locationTo, flightNum, flightPrice);
    Car car = new Car(carPrice, model, brand, locationTo);
    Room room = new Room(roomPrice, locationTo);
    Restaurant restaurant = new Restaurant(date, name, numPeople);
    user.addReservation(car, flight, room, restaurant);
    System.out.println("Reservation Added!");

    System.out.println("--------------------------Summary-----------------------------");
    System.out.println("");
    System.out.println("You Reserved flight number " + flight.getFlightNum() + " departing from " + flight.getLocationFrom() + " going to " +flight.getLocationTo());
    System.out.println("You Reserved a " + car.getBrand() + " " + car.getModel());
    System.out.println("You Reserved " + restaurant.getName() + "on " + restaurant.getDate() + " for a table of " + restaurant.getNumberOfPeople());
    System.out.println("You reserved a room in " + room.getLocation() + " for $" + room.getPrice());
    System.out.println("");
    System.out.println("");
    
    System.out.println("Would You Like to Book another reservation? (Y/N)");
    String yn = sc.nextLine();
    if(yn.equalsIgnoreCase("Y")){
        reserve();
    }
    else{
        System.out.println("Would You Like to check your reservation? (Y/N)");
        yn = sc.nextLine();
        if(yn.equalsIgnoreCase("Y")){
            System.out.println("Enter Your UserID: ");
            User u = storedusers.get(sc.nextLine());
            if(u==null){
                System.out.println("User non existant try again later!");
            } else{
            getReservations(u);
            }
        } else{
            System.out.println("Thank You For Booking With Us, Data is reset!");
            sc.close();
        }
    }
}

public static void getReservations(User user){
    Scanner sc= new Scanner(System.in);
     for(int i=0; i<user.getReservations().size(); i++){
        Flight f = user.getReservations().get(i).getFlight();
        Car c = user.getReservations().get(i).getCar();
        Restaurant r = user.getReservations().get(i).getRestaurant();
        Room ro = user.getReservations().get(i).getRoom();
        System.out.println("--------------------------Booking #"+i+" -----------------------------");
        System.out.println("");
        System.out.println("You Reserved flight number " + f.getFlightNum() + " departing from " + f.getLocationFrom() + " going to " +f.getLocationTo());
        System.out.println("You Reserved a " + c.getBrand() + " " + c.getModel());
        System.out.println("You Reserved " + r.getName() + "on " + r.getDate() + " for a table of " + r.getNumberOfPeople());
        System.out.println("You reserved a room in " + ro.getLocation() + " for $" + ro.getPrice());
        System.out.println("");
     } 


    System.out.println("");
    System.out.println("Total Cost --------- $"+ user.getBill() + " --------------------");
    System.out.println("");


      
      System.out.println("Would You Like to Book another reservation? (Y/N)");
    String yn = sc.nextLine();
    if(yn.equalsIgnoreCase("Y")){
        reserve();
    }  else{
        
            System.out.println("Thank You For Booking With Us, Data is reset!");
            sc.close();
        }
}

}

package ecse437;
public class Car {
    private int price;
    private String model;
    private String brand;
    private String location;


    public Car(int price, String model, String brand, String location){
        this.price = price;
        this.model = model;
        this.brand = brand;
        this.location = location;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return 0;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getLocation(){
        return this.location;
    }
}

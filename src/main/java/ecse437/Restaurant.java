package ecse437;

public class Restaurant {
    public String date;
    public String name;
    public int numberOfPeople;

    public Restaurant(String date, String name, int numberOfPeople){
        this.date = date;
        this.name = name;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName(){
        return this.name;
    }

    public String getDate(){
        return this.date;
    }

    public int getNumberOfPeople(){
        return this.numberOfPeople;
    }
}

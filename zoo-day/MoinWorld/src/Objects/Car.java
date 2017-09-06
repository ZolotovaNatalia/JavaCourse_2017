package Objects;

public class Car {
    private int id;
    private int maxAmountofPassangers;
    private String brand;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxAmountofPassangers() {
        return maxAmountofPassangers;
    }

    public void setMaxAmountofPassangers(int maxAmountofPassangers) {
        this.maxAmountofPassangers = maxAmountofPassangers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go(int dist){
        System.out.println("Bus go " + dist + " km");
    }

    public void stop(){
        System.out.println("Bus stop");
    }

    public void openDoors(){
        System.out.println("Doors are opened");
    }

    public void closeDoors(){
        System.out.println("Doors are closed");
    }

    private Passenger passenger;

    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }


}

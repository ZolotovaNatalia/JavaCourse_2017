package Objects;

public class Traffic {
    public static void main(String[] args){

        int id = 1;
        int maxAmountofPassangers = 30;
        String brand = "BMW";
        String color = "red";

        Car bmwCar = new Car();

        System.out.println("New bus: ");
        System.out.println("Id = " + bmwCar.getId());
        System.out.println("Max amount of passengers = " + bmwCar.getMaxAmountofPassangers());
        System.out.println("Producer = " + bmwCar.getBrand());
        System.out.println("Color = " + bmwCar.getColor());

        // New methods for the call Car



    }
}

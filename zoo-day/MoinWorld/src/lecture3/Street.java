package lecture3;

public class Street {
    public static void main(String[] args) {

        int a = 2;
        int b = 10;
        Bus bus1 = new Bus(1, a, "BMW", "red");
        Bus bus2 = new Bus(2, b, "BMW", "red");


        Passenger passenger1 = new Passenger(1, 20, "Peter");
        Passenger passenger2 = new Passenger(2, 20, "Jan");
        Passenger passenger3 = new Passenger(3, 20, "Hannah");

        Pet pet1 = new Pet("Anna", PetType.DOG, 3);
        Pet pet2 = new Pet("Lena", "Cat", 5);
        Pet pet3 = new Pet("Joseph", "pig", 100);

        passenger1.setPet(pet1);


        //passenger1.addPet(pet1);


        bus1.addPassenger(passenger1);
        bus1.addPassenger(passenger2);
        bus1.addPassenger(passenger3);


    }
}
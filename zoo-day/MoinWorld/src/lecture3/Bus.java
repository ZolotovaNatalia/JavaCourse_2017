package lecture3;

public class Bus {
    private int id;
    private int maxAmountofPassangers;
    private int amountofpassengers = 0;
    private String brand;
    private String color;
    private Passenger[] passengers;
// bisher wurde nur die class definiert

    // constructor
    // this wegen Namenskonflikt

    public Bus(int id, int maxAmountOfPassengers, String brand, String color) {
        this.id = id;
        this.maxAmountofPassangers = maxAmountOfPassengers;
        this.brand = brand;
        this.color = color;
        passengers = new Passenger[maxAmountOfPassengers];
    }


    public int getId() {
        return id;
    }

    public int getMaxAmountofPassangers() {
        return maxAmountofPassangers;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addPassenger(Passenger passenger) {
        if ((amountofpassengers < maxAmountofPassangers) && (passenger != null)) {

            Pet pet = passenger.getPet();

            if(pet != null && (pet.getType() == PetType.DOG || pet.getType() == PetType.PIG)) {
                return;
            }



            for (int i = 0; i < passengers.length; i++) {
                if (passenger.equals(passengers[i])) {
                    return;
                }
            }

            passengers[amountofpassengers] = passenger;
            amountofpassengers++;
            System.out.println("Passenger " + passenger.getName() + " entered");
        } else {
            System.out.println("Passenger " + passenger.getName() + " should take a different Bus");
        }
    }

    public Passenger[] getPassenger() {
        return passengers;
    }

//    public void setPassenger(Passenger passenger) {
//        this.passenger = passenger;
//    }


    // rechte Maustashe - generate - getter and setter

    //  public boolean equals(Bus bus) {
    //      if(bus.id == this.id && bus.color.equals(this.color)){
    //      return true;
    //  }
    //  return false;
}


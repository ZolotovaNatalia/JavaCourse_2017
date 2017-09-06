package lecture3;

public class Passenger {
    private int id;
    private int age;
    private String name;
    private Pet[] pet = new Pet[5];

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }


    public Passenger(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        pet = new Pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        return id == passenger.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

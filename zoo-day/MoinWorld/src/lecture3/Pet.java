package lecture3;

public class Pet {
    private String name;
    private PetType type;
    private int age;


    public Pet (String name, PetType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public PetType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}

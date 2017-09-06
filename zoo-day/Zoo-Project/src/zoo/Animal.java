package zoo;

public class Animal {

    private String name;
    private boolean hungry = true;
    private String sound;


    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void feed() {
        this.hungry = false;
    }

    public void run() {
        this.hungry = true;
    }

    public String getName() {
        return name;
    }

    public void scream() {
        System.out.println(name + " screams " + sound);
    }

}

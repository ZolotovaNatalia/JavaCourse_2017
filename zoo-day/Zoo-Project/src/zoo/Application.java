package zoo;

public class Application {

    public static void main(String[] args) {

        Lion lion1 = new Lion("Zimba");
        Lion lion2 = new Lion("Tom");
        Wombat wombat1 = new Wombat("Horst");

        lion1.knowsSimba();


        Zoo zoo = new Zoo("Hagenbeck", 5);
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(wombat1);

        zoo.open();

    }

}

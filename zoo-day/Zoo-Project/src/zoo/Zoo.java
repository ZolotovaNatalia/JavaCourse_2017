package zoo;

public class Zoo {

    private String name;
    private Animal[] animals;
    private int amountOfAnimals = 0;


    public Zoo(String name, int maxAmountOfAnimals) {
        this.name = name;
        this.animals = new Animal[maxAmountOfAnimals];
    }

    public void addAnimal(Animal animal) {
        animals[amountOfAnimals] = animal;
        amountOfAnimals++;
    }

    public void open() {
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if(animal != null && animal instanceof Lion) {
                animal.scream();
            }
        }
    }



}

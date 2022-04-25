package casting;

public class Casting {

    public static void main(String[] args) {
        Dog mrDoggo = new Dog();
        Cat mrCat = new Cat();
        doWhatAnimalDo(mrDoggo);
        doWhatAnimalDo(mrCat);
    }

    public static void doWhatAnimalDo(Animal animal){ // This is a Upcasting paramether class to the superclass Animal
        animal.makeNoise();
        if(animal instanceof Dog){ // if the animal pass are an instance of de class Dog then
            Dog dDog = (Dog) animal; // make a downcasting to Dog class to make access to they methods
            dDog.growl();
        }
    }
}

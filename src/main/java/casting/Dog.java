package casting;

public class Dog extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Olf! Olf!");
    }

    public void growl(){
        System.out.println("Grrrrr!");
    }
}

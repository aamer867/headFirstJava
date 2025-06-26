public class Animal {
    public void speak() {
        System.out.println("I'm an animal");
    }
    public Animal returnAnimal(Animal a) {
        return a;
    }
    @Override
    public String toString() {
        return "Animal";
    }
}

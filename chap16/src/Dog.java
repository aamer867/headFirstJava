import java.io.Serializable;

class Dog extends Animal implements Serializable {  // Serializable
    public String breed;
    public Dog() {
        this.breed = "Hello";
        System.out.println("Dog constructor called");  // This WON'T run!
    }
}
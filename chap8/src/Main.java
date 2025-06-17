//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Class method is the class, which can not be extended anymore.
        // An abstract method is the method, which it must be overridden.
        // We can't have an abstract method, without an abstract class.
        // If we have an abstract method within a class, when we extend this class,
        // we must implement all abstract methods within the extended class.
        // We need abstract methods only to Polymorphism.
        // Why to have this concept of the abstract methods??
        //      To be able to ensure the Polymorphism, like if we need to use the Animal class
        //      as an array type and loop over this array to and apply a specific method in
        //      the Animal class, but with every subclass behaviour. Making the method abstract
        //      will ensure that every subclass has its own method implementation.
        //      If the subclass is abstract, we can easily ignore to implement it,
        //      because if the subclass is abstract, we will not be able to instantiate it,
        //      so we will not be able to call the method. But if we make a subclass that extends the
        //      abstract subclass, we must implement all the abstract methods in the both:
        //      the extended abstract class, the abstract superclass. So we need to make them all from the superclass
        //      till the class, which will be able to be instantiated.
        //      When implementing the method, we can easily ignore to add Override annotation.
        // So at the end, we have both types of classes:
        //      Abstract class, Concrete class.

    }
}
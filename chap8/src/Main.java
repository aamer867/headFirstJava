import java.util.ArrayList;

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
        // Any object created in Java, will extend the Object Class, but wait:
        //      What if the class was extended by another superclass:
        //          So it will not be explicitly extend object class,
        //          but the superclass will extend it. So it will be extending it not impliciltly.
        //          Any class that doesn’t explicitly extend another class, implicitly extends Object.
        // All abstract methods MUST be implemented by the first concrete subclass down the inheritance tree.
        // Let us here differentiate between getClass:
        //      So getClass will search for the object in the heap.
        Dog dog = new Dog();
        Animal dogAnimal = new Dog();
        Animal animal = new Animal();
        System.out.println(dogAnimal.getClass().getName());
        System.out.println(dogAnimal.getClass().getSuperclass().getName());
        System.out.println(dog.getClass().getName());
        System.out.println(dog.getClass().getSuperclass().getName());

        // Here, we will look for isinstanceof:
        //      So, instance of will look for both the object in the heap, and the reference.
        //      it checks whether the actual object the reference is pointing to (at runtime)
        //      is an instance of a given class or subclass.
        System.out.println(dogAnimal instanceof Dog);

        System.out.println(dogAnimal instanceof Animal);
        // Here in this example this heppens:
        //      "Is the actual object pointed to by dog an instance of the class Animal, or a subclass of Animal?"

        System.out.println(animal instanceof Dog);

        // You’re encouraged (strongly) to override hashCode(), equals(), and toString() in your own classes

        // Note For an ArrayList:
        // When you put an object into an ArrayList<Dog>,  it goes in as a Dog, and comes out as a Dog
        // If we have an arrayList filled with a reference type of superclass,
        // and then we added an object with a type of subclass, and then we try to pull,
        // or get this object with its actual type it will cause an error due to type problem.
        // Like the next example.

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        // Dog d = animals.get(0);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog);
        Animal d = dogs.get(0);

        // Let us have an example regarding the return type of the polymorphic world:
        Animal a = new Animal();
        // a.returnAnimal(dog); will return an Animal object.
        // We can not limit it to be only a Dog like that:
        // Dog z = a.returnAnimal(dog); // This will lead to an error.
        // Although we are returning from the method a dog, but the compiler does not know that,
        // the method signature is only that it returns an Animal.
        // Keep in mind that reverse is not true, when the method signature returns a dog,
        // and we are returning an Animal, but we have to cast it first to a dog.

        // Here we defined b as a dog but with a reference type Animal, so the compiler will have no problem with it.
        Animal b = new Dog();
        System.out.println(a.returnAnimal(b));

        Object ob = new Dog();

        // The rule in polymprphism is that: WE ONLY CAN GO --HIGHER FROM RIGHT TO LEFT,
        // meaning that superclass = subclass, So I saved the subclass in a higher sized variable--:
        // Object does not know that it has an Animal class, so we can pass
        // any subclass to a superclass, because the subclass knows that in
        // its tree there is this superclass.
        // There is another problem also in that the JVM looks for the Heap,
        // but the compiler looks for the reference. So, even if we have:
        // Object o = new Dog;
        // and we tried to call a function on o, this function related to the
        // Dog, the compiler will never know that this o, is a dog.
        // NOTE: CASTING works in a different way.

        // So We're into a new thing:
        // Snowboard s = new Snowboard();
        // Object o = s;
        // What will the object o have?
        // In the compiling time the methods from o will be only the methods from the class Object only.
        // In the runtime, if we imaginingally stopped the checker from the compiler, the o can apply
        // the methods from the snowboard class.

        // Expose the method = make it public in the class.

        Object obj1 = new Dog();
        System.out.println(d);

        // We're into a new concept:
        //      Interface: a class with all methods are abstract,
        //                 No Instance variable if so: it will be implicitly static, final.
        //      Why to use Interface:
        //          Java afford interface as a solution for the Deadly Diamond of Death problem (DDD).
        //              this problem is when we have two classes inherit from a superclass,
        //              and a subclass that inherits from both of them, then if we have, for ex,
        //              an abstract method in the superclass that the two classes have overridden,
        //              then which method will be used at the subclass?
        //          So, we have the Interface solution as a prevention to the DDD problem, but at the
        //          same time, we afford a solution multiple inheritance. Because in the interface all
        //          the subclasses that inherit them, must override the abstract method.

        // How do you know whether to make a class, a subclass, an abstract class, or an interface?
        // 1. Make a class that doesn’t extend anything (other than Object) when
        // your new class doesn’t pass the IS-A test for any other type.
        // 2. Make a subclass (in other words, extend a class) only when you need to make a more specific
        // version of a class and need to override or add new behaviors.
        // 3. Use an abstract class when you want to define a template for a group of subclasses, and you
        // have at least some implementation code that all subclasses could use. Make the class abstract
        // when you want to guarantee that nobody can make objects of that type.
        // 4. Use an interface when you want to define a role that other classes can play, regardless of where
        // those classes are in the inheritance tree.

        Animal a1 = new Animal();
        Canine c1 = new Canine();
        Dog d1 = new Dog();


    }
}
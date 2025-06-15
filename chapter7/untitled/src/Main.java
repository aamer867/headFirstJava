//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Here we are learning the basic concepts of how to make inheritance.

        // When you design with inheritance, you put common code in
        // a class and then tell other more specific classes that the
        // common (more abstract) class is their superclass.

        // “members of a class”: we mean the instance variables and methods.

        // Instance variables are not overridden because they don’t need to be.
        // When the user need to add a new instance var with the same name,
        // it is called: Hiding, or shadowing.
        // Only methods are overridden.

        // How to design a collection of classes:
        // 1. Look for objects that have common attributes and behaviors.
        //      1.1  What do these six types have in
        //         common? This helps you to abstract
        //         out behaviors. (step 2)
        //      1.2  How are these types related? This
        //         helps you to define the inheritance
        //         tree relationships (step 4-5)
        // 2. Design a class that represents the common state and behavior.
        //    We’ll put in methods and instance
        //    variables that all subclasses might
        //    need.
        // 3. Decide if a subclass needs behaviors (method implementations) that are specific
        //    to that particular subclass type.
        // 4. Look for more opportunities to use abstraction, by finding two or more
        //    subclasses that might need common behavior.
        // 5. Finish the class hierarchy
        // 6. Using IS-A, and Has-A?
        //      6.1.  When you want to know if one thing should extend another, apply the IS-A test.
        //      6.2.  To know if you’ve designed your types correctly, ask, “Does it make sense to
        //            say type X IS-A type Y?”  If it doesn’t, you know there’s something wrong
        //            with the design
        //      6.3.  Does it make sense to say “Bathroom HAS-A Tub”?  If yes, then it means that Bathroom has a
        //            Tub instance variable. In other words, Bathroom has a reference to a Tub, but
        //            Bathroom does not extend Tub and vice versa.
        //      6.4. the inheritance IS-A relationship works in only one direction.
        //      6.5.  Triangle IS-A Shape = Triangle extend Shape.
        //      6.6.  If X extends Y, then X IS-A Y must make sense.
        // 7. Access levels:
        // Code that does not have access to a class is not allowed to even think about the class.
        // And by think, we mean use the class in code. For example, if you don’t have access to a class,
        // because of access restriction, you aren’t allowed to instantiate the class or even declare it
        // as a type for a variable, argument, or return value.
        // You simply can’t type it into your code at all! If you do, the compiler will complain.
        // You can’t access a method if you can’t see the class.
        //
        // Top Level, Classes:
        // | Modifier                | Accessible in Same Package | Accessible in Other Packages | Can Be Extended              | Notes                          |
        // | ----------------------- | --------------------------- | ---------------------------- | --------------------------- | -----------------------------  |
        // | `public`                | ✅ Yes                      | ✅ Yes                     | ✅ Yes                        | Fully visible everywhere       |
        // | non-public(no modifier) | ✅ Yes                      | ❌ No                      | ✅ Yes (in same package only) | Package-private                |
        // | `private`               | ❌ Not allowed              | ❌ Not allowed             | ❌ Not allowed                | Only in inner classes.         |
        // | `final`                 | ❌ Not allowed              | ❌ Not allowed             | ❌ Not allowed                | No Inheritance will be allowed.|
        // | `private Constructor`   | ❌ Not allowed              | ❌ Not allowed             | ❌ Not allowed                | No Inheritance will be allowed.|
        // Why to make a class final?
        // If we need the methods of this subclass to work only in the same way we declared it, to make sure also that
        // they will not be overridden, We can also make only one method or more to be final, if we want.
        //
        // Class Members (Fields, Methods, Constructors):
        // | Modifier    | Accessible in Same Class | Accessible in Same Package | Accessible in Subclass (Same Package) | Accessible in Subclass (Different Package)                        | Accessible in Other Classes (Different Package) |
        // | ----------- | ------------------------ | -------------------------- | ------------------------------------- | ------------------------------------------------------------------| ----------------------------------------------- |
        // | `public`    | ✅ Yes                    | ✅ Yes                      | ✅ Yes                                 | ✅ Yes                                                        | ✅ Yes                                           |
        // | `protected` | ✅ Yes                    | ✅ Yes                      | ✅ Yes                                 | ✅ Yes *(only via inheritance)*, this, super only             | ❌ No                                            |
        // | *default*   | ✅ Yes                    | ✅ Yes                      | ✅ Yes                                 | ❌ No                                                         | ❌ No                                            |
        // | `private`   | ✅ Yes                    | ❌ No                       | ❌ No                                  | ❌ No                                                         | ❌ No                                            |
        //
        //      7.1. Public: public members are inherited.
        //      Both protected and default access levels are tied to packages.
        //          7.2. Protected:
        //          7.3. Default: it means that only code within the same package can access code with default access
        //          , we can extend it.
        //      7.4. Private: private members are not inherited.
        // 8. use inheritance when one class is a more specific type of a superclass.
        // Example: Willow is a more specific type of Tree, so Willow extends Tree makes sense.
        // 9.  consider inheritance when you have behavior (implemented code) that should be shared among
        // multiple classes of the same general type.
        // 10. DO NOT use inheritance just so that you can reuse code from another class, if the relationship between
        // the superclass and subclass violate either of the above two rules.
        // 11. DO NOT use inheritance if the subclass and superclass do not pass the IS-A test.
        //
        // We will look at how to define the class and the subclass:
        //      classType objName = new classType();
        //      EX: Dog myDog = new Dog(); LHS = RHS;
        //      The LHS is the reference type.
        //      The RHS is the space in the garbage collectable heap.
        //
        // What is the difference between Overloading, overriding?
        //      In Overriding, we need the same arguments, and the return type. 'They must be the same, in both classes'
        //      In return type: it can be the same type, or the subclass type.
        //
        //      In Overloading, The method can't be less accessible,
        //          good example for this is in the journal app, Backend/OOP/Headfirst(page16)
        //      The arguments list must be changed so that it can be a overloaded,
        //      if we change only the return type it will be overriding.

        // NOTE:
        // The compiler guarantees that a particular method is callable for a specific reference type,
        // but it doesn’t say (or care) from which class that method actually comes from at runtime.
        // The type of the object is the reference type.

        Dog d = new Dog();
        System.out.println(d.name);

        // Animal.roam(int value);
        // Dog.roam();
        Animal a = new Dog();
        // a.roam(); //This is an error because, JVM uses the type related to the object from the heap.

        // Animal.roam();
        // Dog.roam(int value);
        Animal b = new Dog();
        b.roam(); // This will work, because the JVM firstly looks for it in the heap, with the type Dog, but he will not find this method,
        // so he will take one degree upper and look for it in the Superclass.
        // b.roam(15); // This will also give an error, because the compiler will look for only the reference type not the type in the heap.
    }
}


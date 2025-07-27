//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We will discuss here the topic of Heap, and stack:
        // Where the object live: the Heap 'Garbage Collectible Heap',
        // Where the method invocations, and local variables live: the Stack.
        // Where the variables live?
        //      Before We got to answer this question,
        //      we have to distinguish between the type of variables:
        //          1. Local Variables (Stack Variables):
        //              They are the variables inside the method, and Parameters.
        //              They’re temporary, and live only as long as the method is on the stack (in other words,
        //              as long as the method has not reached the closing curly brace).
        //              When the local variable is an object:
        //                  All the objects live in the Heap,
        //                  only the reference (the remote control) is saved in the Stack.
        //                  By the remote control, reference I mean the Address of the object.
        //                  NOTE: No matter where the object is declared, it is always saved in the HEAP.
        //          2. Instance Variables: They are living on the Heap,
        //                                 the same place where there objects are declared.
        // How the objects are saved?
        //      1. When you say new CellPhone(), Java has to make space on the Heap for that CellPhone.
        //      2. The values of an object’s instance variables live inside the object. If the instance variables
        //  are all primitives, Java makes space for the instance variables based on the primitive type. An int needs
        //  32 bits, a long 64 bits, etc. Java doesn’t care about the value inside primitive variables;
        //  the bit-size of an int variable is the same (32 bits) whether the value of the int is 32,000,000 or 32.
        //      3. what if the instance variables are objects:
        //          It is saved in the Heap, the reference of the new object. "So it is saved only the reference not
        //          the whole object, because we do not need it."
        //      4. All the instance variables from the subclass up to the upper superclass are created in the subclass,
        //      even if they are private in the superclass, but the subclass will not be able to access them.
        // Method Invocations:
        //      The method on the top of the stack is always the currently executing method.
        // Constructors:
        //      They are NOT INHERITED.
        //      The default values for the parameters are not supported, even for the methods.
        //          We will solve this problem, with the OVERLOADING of the constructor.
        //          What only counts for different constructors: 1. Type. 2. ORDER. YEAH ORDER DOES MATTER.
        //      The default Constructor _no-arg constructor_:
        //          It is created automatically from the Compiler, IFF there is no Constructor in the class.
        //      Let us consider this problem: How the object creation is done, and instance variables are saved?
        //          1. when the new keyword is used to create a new object:
        //              JVM will call all the Constructors from the Upper superclass to class,
        //              It will give the default values to every instance variable if non-given.
        //          2. We must care about, not only the setters, but also the constructors:
        //              If we are giving a specific value, that the instance variable must not have like 0, 0.0,
        //              or even null, we must include that in the constructor itself, because this is the default
        //              value which will be given to the instance variable.
        //       There is two things, the compiler is done for us, if we do not make it:
        //          1. If we did not provide a constructor will be provided.
        //          2. If we used inheritance, and did not write a super in our subclass, will be called automatically.
        //              2.1. The compiler only calls the no-arg constructor.
        //              2.2. If we want to add it manually, we must add it in the first line in the constructor.
        //       Every Constructor has either this, or super.
        //
        // How the object dies:
        //      1. The life of the object depends on the life of the references,
        //      so if the reference dies, the object dies.
        //      2. So, we need to take care of the reference variable:
        //          2.1. If the reference variable is a local variable:
        //              The variable will live as long as the method in the stack, once it pops out, its reference is died.
        //          2.2. If the reference variable is an instance variable:
        //              The instance variables are alive as long as the object is alive, once the object dies the
        //              instance variables die too.
        //          2.3. As long as there is a reference to the object, the object will be kept in the Heap.
        // What is the difference between life, and scope of the local variable:
        //      Life: A local variable is alive as long as its Stack frame is on the Stack. In other words,
        //      until the method completes.
        //      Scope: A local variable is in scope only within the method in which the variable was declared.
        //      When its own method calls another, the variable is alive, but not in scope until its method resumes.
        //      You can use a variable only when it is in scope.

        Dog dog = new Dog();
        dog.bark();
        dog = null;
        // dog.bark(); // This will not cause compiler error, meaning compilation will be done, but it will cause a runtime error.
    }
}
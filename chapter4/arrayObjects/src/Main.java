//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Comparing in Java:

        // Primitives:

        // == used ot compare values.

        // char, int, short do not have equals method.

        int a = 5;
        int b = 5;

        System.out.printf("int, & int Same values %b \n", a==b);

        short c = 5;
        System.out.printf("Short, & int Same values %b \n", c==a);

        // Refrences:

        // Using == compares references (memory addresses)

        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(5);

        System.out.printf("Dog, Dog Same instance variables, Using ==: %b \n", dog1 == dog2);

        // To make it work correctly, we have to override .equals method in the Dog Class.
        System.out.printf("Dog, Dog Same instance variables, Using .equals: %b \n", dog1.equals(dog2));

        Dog dog3 = dog2;
        dog3.age = 23;

        System.out.println(dog2.age);

        System.out.printf("Dog, Copied Dog, Using ==: %b \n", dog3==dog2);

        System.out.printf("Dog, Copied Dog, Using .equels: %b \n", dog3.equals(dog2));

        System.out.println(dog2.age);

        changeAge(dog2);

        System.out.println(dog2.age);


    }

    public static void changeAge(Dog obj)  {
        obj.age = 15009;
    }
}
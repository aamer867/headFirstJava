import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // We can NEVER have an object of Match class.
        // Static methods: does not depend on any instance variable.
        /*
         * Static methods are used with the Class names.
         * How to restrict a class from being instantiated:
         *   1. make it abstract.
         *   2. make its constructor private.
         *       Here, this means that nobody outside the class can invoke the complier
         *       , only within the class.
         * We can call a static method, using any instance of the class "object", but that is misleading.
         *   Also, calling a static method from an object, the static method will have no information about
         *   the object.
         * The static variable: Only instantiated for the first time the class is called.
         * The object does not keep its own copy of the static variables.
         *
         * Static variables in a class are initialized before any object of that class can be created.
         * Static variables in a class are initialized before any static method of the class runs.
         *
         * non-static methods can always call a static methods, or variables.
         *
         * Final:
         *   Static final variables are the constants, writing convention is ALL CAPS, with _ separate words: FOO_X.
         *       Static final variables must be initialized, if not compiler error.
         *       Also, we can initialize all the statics inside a "Static Initializer":
         *           First we have to declare all the final static variables,
         *           then, we open static{} and between paranthesis we can add all the values.
         *           Static Initializer is the first block to run when the class is loaded.
         *   non-satic final variables:
         *       1. can never be changed.
         *       2. can be declared, without the first initialization, then we can initialize it later.
         *   final methods mean no one can override it.
         *   final classes means no one can extend this class, no subclasses. "NOTE: there is no private top-level class"
         *
         * The Formatter:
         *      After the type indicator,the formatter assumes the next set of characters are meant to be
         *      part of the output String, until or unless it hits another percent (%) sign.
         *
         * */

        // TestBox t = new TestBox();
        // t.go();

        int one = 20456654;
        double two = 100567890.248907;
        String s = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(s);
    }
}
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("=== CREATING ORIGINAL OBJECT ===");
        Poodle originalPoodle = new Poodle();

        // Modify the name after creation
        originalPoodle.name = "Fluffy";
        originalPoodle.size="Small";
        originalPoodle.breed="Servus";

        System.out.println("Original: " + originalPoodle);

        System.out.println("\n=== SERIALIZING ===");
        serializeObject(originalPoodle, "test.ser");

        System.out.println("\n=== DESERIALIZING ===");
        Poodle deserializedPoodle = deserializeObject("test.ser");

        System.out.println(deserializedPoodle.size);
        System.out.println(deserializedPoodle.breed);
        System.out.println(deserializedPoodle.name);
    }

    public static void serializeObject(Poodle obj, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(obj);
            System.out.println("Object serialized to " + filename);
        } catch (IOException e) {
            System.err.println("Serialization failed: " + e.getMessage());
        }
    }

    public static Poodle deserializeObject(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Poodle obj = (Poodle) in.readObject();
            System.out.println("Object deserialized from " + filename);
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed: " + e.getMessage());
            return null;
        }
    }
}
public class Dog {
    public int age;
    public Dog(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null | !(obj instanceof Dog)) { return false; }
        Dog other = (Dog) obj;
        return age == other.age;
    }
}

class Poodle extends Dog {  // Serializable (inherited)
    public String size;
    public Poodle() {
        this.size = "big";
        System.out.println("Poodle constructor called");  // This WON'T run!
    }
}
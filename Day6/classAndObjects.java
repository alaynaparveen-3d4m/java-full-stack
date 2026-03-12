class ClassAndObjects {

    // Instance variables
    String color;
    String brand;
    String model;
    int maxSpeed;

    // Constructor
    ClassAndObjects(String color, String brand, String model, int maxSpeed){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {

        // Creating object using constructor
        ClassAndObjects car1 = new ClassAndObjects("Black", "Toyota", "Innova", 300);

        System.out.println(car1.brand + " " + car1.model + " " + car1.maxSpeed);
    }
}
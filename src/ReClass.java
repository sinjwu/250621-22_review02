class Car {
    String brand;
    String model;
    int year;

    public void displayinfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

public class ReClass {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.brand = "Rolls Royce";
        mycar.model = "Phantom";
        mycar.year = 2026;
        mycar.displayinfo();
    }
}

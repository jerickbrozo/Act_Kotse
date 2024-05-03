class Vehicle {
    private final String make;
    private final String model;
    private final int numYear;

    public Vehicle(String makeName, String modelName, int year) {
        make = makeName;
        model = modelName;
        numYear = year;
    }
    public String makeName() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getNumYear() {
        return numYear;
    }
}
     class Car extends Vehicle {
        private final int numberOfDoors;

        public Car(String make, String model, int numYear, int numberOfDoors) {
            super(make, model, numYear);
            this.numberOfDoors = numberOfDoors;
        }
        public void displayDetails() {
            System.out.println("______________________");
            System.out.println("| Car Details:       |");
            System.out.println("| Make: " + makeName() + "       |");
            System.out.println("| Model: " + getModel() + "       |");
            System.out.println("| Year: " + getNumYear() + "         |");
            System.out.println("| Number of Doors: " + numberOfDoors + " |");
            System.out.println("----------------------");
        }
    }
public class Kotse{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        myCar.displayDetails();
    }
}
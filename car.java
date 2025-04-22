class Car {

    String model;

    public void displayModel() {
        System.out.println("Cars model is: " + model);
    }
}

public class car {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.model = "BMW M4";
        myCar.displayModel(); 
    }
}


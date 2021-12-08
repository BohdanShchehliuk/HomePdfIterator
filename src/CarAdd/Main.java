package CarAdd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(200, 2000, "BMW", "blue");
        Car car2 = new Car(200, 2000, "MWB", "blue");
        Car car3 = new Car(200, 4000, "Mersedess", "black");
        Car car4 = new Car(220, 2200, "Toyyota", "green");
        Car car5 = new Car(200, 2000, "BMW", "black");

        Car[] car = new Car[]{car1, car2, car3, car4, car5};
        Arrays.sort(car);
        System.out.println("\nAfter Sort\n");
        for (Car tmp : car) {
            System.out.println(tmp);
        }
    }
}

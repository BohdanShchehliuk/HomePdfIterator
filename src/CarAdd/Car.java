package CarAdd;

public class Car implements Comparable {
    public int speed;
    public int price;
    public String model;
    public String colour;

    public Car(int speed, int price, String model, String colour) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.colour = colour;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        if (this.speed > ((Car) o).speed) {
            return -1;
        } else if (this.speed < ((Car) o).speed) {
            return 1;
        }
        if (this.price > ((Car) o).price) {
            return -1;
        } else if (this.price < ((Car) o).price) {
            return 1;
        }
        if (this.model.compareTo(((Car) o).model) > 0) {
            return -1;
        } else if (this.model.compareTo(((Car) o).model) < 0) {
            return 1;
        }
        if (this.colour.compareTo(((Car) o).colour) > 0) {
            return -1;
        } else if (this.colour.compareTo(((Car) o).colour) < 0) {
            return 1;
        }
        return 0;
    }
}

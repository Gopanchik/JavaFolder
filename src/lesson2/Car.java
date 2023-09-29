package lesson2;

public class Car {

    String name = "Mersedes";
    int speed = 100;

    public static void main(String[] args) {
        Car mersedes = new Car();

        System.out.println(mersedes);
    }

    @Override
    public String toString() {

    return "My car: \nname = " + name + ", speed  of car = " + speed;

    }



}

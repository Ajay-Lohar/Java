package ObjectOrieantedProgramsPractice;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed=110;
        car.color="green";
        car.drive();
        System.out.println(car.color);
    }
}

public class Main {

    public static float m = 3000;
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        Nav nav = new Nav();
        Thread threadCar = new Thread(car);
        Thread threadNav = new Thread(nav);
        threadCar.start();
        threadNav.start();
    }
}
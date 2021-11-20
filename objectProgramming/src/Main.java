public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.startEngine();
        audi.accelerate(20);
        audi.accelerate(20);
        audi.decelerate(15);
        audi.decelerate(66);
        audi.stopEngine();
    }
}

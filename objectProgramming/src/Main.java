public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.startEngine();
        audi.setLights(true);
        System.out.println("Checking lights ... "+audi.getLights());
        audi.setGear(1);
        audi.accelerate(20);
        audi.setGear(2);
        audi.accelerate(20);
        audi.decelerate(15);
        audi.decelerate(66);
        System.out.println("Checking gear ... "+audi.getGear());
        audi.stopEngine();
        audi.switchLights();

    }
}

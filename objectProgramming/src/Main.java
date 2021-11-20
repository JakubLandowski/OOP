public class Main {
    public static void main(String[] args) {

        /*Car audi = new Car(0, 1, "A8", false);
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



        Car fiat = new Car(300, 2, "Panda", true);
        System.out.println("Change car to "+fiat.getName());
        System.out.println("Getting speed ... "+fiat.getSpeed());
        fiat.switchLights();
        fiat.decelerate(250);
        fiat.decelerate(77);

        Car lada = new Car();
        Car hyundai = new Car("I30");
        Car ursus = new Car(10, 5, "C-330");*/      // previous exercises

        Kia rio = new Kia(2010,"Kia Rio", false, 150000, "Comfort");
        rio.startEngine();

        Vehicle vehicle = new Vehicle(2000, "vehicle", false, 0);
        vehicle.startEngine();

        Golf golf = new Golf(1999, "Golf", true, 3000, Drive.RWD);

    }
}

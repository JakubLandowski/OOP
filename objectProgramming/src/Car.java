public class Car {

    private int speed = 0;
    private int gear;
    private String name;
    private boolean lights = false;

    public Car(int speed, int gear, String name, boolean lights){
        this.speed = speed;
        this.gear = gear;
        this.name = name;
        this.lights = lights;
    }
    public Car(){

    }
    public Car(int speed, int gear, String name){
        this.speed = speed;
        this.gear = gear;
        this.name = name;
    }



    public void startEngine(){
        System.out.println("Engine on");
    }
    public void stopEngine(){
        System.out.println("Engine off");
    }

    public void accelerate(int speed){
        this.speed += speed;
        System.out.println("Car is moving at speed "+this.speed+" km/h");
    }
    public void decelerate(int speed){
        this.speed -= speed;
        if(this.speed>0)
            System.out.println("Car is moving at speed "+this.speed+" km/h");
        else {
            this.speed=0;
            System.out.println("Car stopped");
        }
    }

    public void setGear(int gear){
        if (gear > 0 && gear < 7){
            this.gear = gear;
            System.out.println("Active gear "+this.gear);
        }
        else System.out.println("Incorrect gear");
    }
    public int getGear(){
        return this.gear;
    }

    public void switchLights(){
        lights = !lights;
        if (lights == true) System.out.println("lights on");
        else System.out.println("lights off");
    }
    public void setLights(boolean lights){
        this.lights = lights;
    }
    public boolean getLights(){
        return lights;
    }

    // automatically generated setters and getters
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}

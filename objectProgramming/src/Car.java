public class Car {

    private int speed = 0;
    private int gear;
    private String name;
    private boolean lights = false;

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



}

public class Car {

    private int speed = 0;
    private int gear;
    private String name;
    private boolean lights = false;

    public void startEngine(){
        System.out.println("Silnik działa");
    }
    public void stopEngine(){
        System.out.println("Silnik zgasł");
    }

    public void accelerate(int speed){
        this.speed += speed;
        System.out.println("Samochód jedzie z prędkością "+this.speed+" km/h");
    }
    public void decelerate(int speed){
        this.speed -= speed;
        if(this.speed>0)
            System.out.println("Samochód jedzie z prędkością "+this.speed+" km/h");
        else {
            this.speed=0;
            System.out.println("Samochód zatrzymał się");
        }
    }

    public void setGear(int gear){
        if (gear > 0 && gear < 7){
            this.gear = gear;
            System.out.println("Aktywny bieg "+this.gear);
        }
        else System.out.println("Nie ma takiego biegu");
    }
    public int getGear(){
        return this.gear;
    }

    public void switchLights(){
        lights = !lights;
        if (lights == true)
            System.out.println("światła włączone");
        else System.out.println("światła wyłączone");
    }
    public void setLights(boolean lights){
        this.lights = lights;
    }
    public boolean getLights(){
        return lights;
    }



}

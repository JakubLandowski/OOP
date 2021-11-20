public class Car {

    private int speed = 0;

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

}

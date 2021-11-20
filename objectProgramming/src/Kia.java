public class Kia extends Vehicle {

    private String seatType;

    public Kia(int dateOfProduction, String model, boolean airCon, int mileage, String seatType){
        super(dateOfProduction, model, airCon, mileage);
        this.seatType = seatType;
    }

    @Override
    public void startEngine(){
        System.out.println("KIA engine on");
    }

}

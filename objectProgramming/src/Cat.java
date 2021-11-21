public class Cat implements Animal {


    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

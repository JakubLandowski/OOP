public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("ZzZzZz");
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

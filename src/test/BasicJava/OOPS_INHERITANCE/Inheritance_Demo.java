package OOPS_INHERITANCE;

public class Inheritance_Demo {

    public void start() {
        System.out.println("Inheritance_Demo.........Started the execution");
    }

    static class Inheritance_Demo2 extends Inheritance_Demo {
        public void stop() {
            System.out.println("Inheritance_Demo2.........Stopped the execution");
        }
    }

    public static void main(String[] args) {
        Inheritance_Demo i1 = new Inheritance_Demo();
        i1.start();

        Inheritance_Demo2 i2 = new Inheritance_Demo2(); // ✅ Now works
        i2.stop();
        i2.start();
    }
}

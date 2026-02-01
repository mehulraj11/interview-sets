interface arm {
    default void arm() {
        System.out.println("arm default");
    }
}

interface visible {
    void visible();
}

interface swim {
    void swim();
}

interface body1 extends arm, visible {
    void arm();

    void visible();
}

interface body2 extends arm, swim {
    @Override
    void swim();

    @Override
    void arm();
}

class mehul implements body1 {
    public void arm() {
        System.out.println("arm");
    }

    public void visible() {
        System.out.println("visible");
    }
}

class mohit implements body2 {
    @Override
    public void arm() {
        System.out.println("left");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}

public class Main {


    public static void main(String[] args) {
        mehul m1 = new mehul();
        System.out.println(m1 instanceof mehul);
        System.out.println(m1 instanceof body1);
        System.out.println(m1 instanceof arm);
        System.out.println(m1 instanceof visible);
        System.out.println(m1 instanceof swim);
        body1 m2 = new mehul();
        System.out.println(m2 instanceof mehul);
        if (m2 instanceof mehul) {
            mehul m3 = (mehul) m2;
            System.out.println("done");
        }
    }
}
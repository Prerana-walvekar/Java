interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is flying over the mountains.");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        Flyable[] objects = { new Spacecraft(), new Airplane(), new Helicopter() };

        // Loop to print the exact output
        for (Flyable obj : objects) {
            obj.fly_obj();
        }
    }
}

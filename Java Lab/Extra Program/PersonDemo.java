abstract class Person {
    abstract void eat();
    abstract void sleep();
    abstract void exercise();
}

class Athlete extends Person {
    void eat() {
        System.out.println("Athlete eats a balanced diet.");
    }

    void sleep() {
        System.out.println("Athlete sleeps for 8 hours.");
    }

    void exercise() {
        System.out.println("Athlete exercises daily.");
    }
}

class LazyPerson extends Person {
    void eat() {
        System.out.println("Lazy person eats junk food.");
    }

    void sleep() {
        System.out.println("Lazy person sleeps for 12 hours.");
    }

    void exercise() {
        System.out.println("Lazy person rarely exercises.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        athlete.eat();
        athlete.sleep();
        athlete.exercise();

        lazyPerson.eat();
        lazyPerson.sleep();
        lazyPerson.exercise();
    }
}

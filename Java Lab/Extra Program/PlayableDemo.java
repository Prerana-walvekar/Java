interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football.");
    }
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball.");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

public class PlayableDemo {
    public static void main(String[] args) {
        Playable[] sports = { new Football(), new Volleyball(), new Basketball() };

        for (Playable sport : sports) {
            sport.play();
        }
    }
}

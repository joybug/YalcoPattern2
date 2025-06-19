package solid_princibles.liskov_substitution.ex01.noncompliant;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Bird is flying

        Bird penguin = new Penguin();
        penguin.fly(); // Throws UnsupportedOperationException
    }
}

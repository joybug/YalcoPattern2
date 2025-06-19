package solid_princibles.liskov_substitution.ex01.noncompliant;

// Child class Penguin that violates LSP
public class Penguin extends Bird {
    @Override
    public void fly() {
        // Penguins cannot fly
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

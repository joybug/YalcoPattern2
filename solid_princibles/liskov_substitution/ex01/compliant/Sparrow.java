package solid_princibles.liskov_substitution.ex01.compliant;

// Class for a bird that can fly
public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

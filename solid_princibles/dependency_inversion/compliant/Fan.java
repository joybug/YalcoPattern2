package solid_princibles.dependency_inversion.compliant;

// Low-level class implementing the interface
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is stopping");
    }
}

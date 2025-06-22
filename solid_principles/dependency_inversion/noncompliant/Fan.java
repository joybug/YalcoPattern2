package solid_principles.dependency_inversion.noncompliant;

// Low-level class
public class Fan {
    public void spin() {
        System.out.println("Fan is spinning");
    }

    public void stop() {
        System.out.println("Fan is stopping");
    }
}

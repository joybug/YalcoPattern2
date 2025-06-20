package structural_patterns.adapter.ex02;

// Adaptee
public class VGA {
    void connectWithVgaCable(boolean highQuality) {
        System.out.println(
            "Displaying via VGA with high quality: " + highQuality
        );
    }
}

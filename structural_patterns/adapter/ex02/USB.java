package structural_patterns.adapter.ex02;

// Adaptee
public class USB {
    void connectWithUsbCable(String data) {
        System.out.println("Displaying via USB with data: " + data);
    }
}

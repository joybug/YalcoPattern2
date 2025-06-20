package structural_patterns.bridge.ex01;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device is muted.");
    }
}

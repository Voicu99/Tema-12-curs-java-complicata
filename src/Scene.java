import java.util.List;

public class Scene {
    private String name;
    private List<Device> devices;

    public Scene(String name, List<Device> devices) {
        this.name = name;
        this.devices = devices;
    }

    public void activateScene() {
        System.out.println("Activating scene: " + name);
        for (Device device : devices) {
            if (device instanceof Light) {
                device.performAction("turn on");
            } else if (device instanceof Thermostat) {
                device.performAction("set temperature to 22");
            } else if (device instanceof Door) {
                device.performAction("lock");
            }
        }
    }
}

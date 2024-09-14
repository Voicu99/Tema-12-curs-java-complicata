public class Homeowner extends User {
    public Homeowner(String name) {
        super(name, "Homeowner");
    }

    @Override
    public void controlDevice(Device device, String action) {
        System.out.println(name + " (Homeowner) is controlling the device: " + device.getName() + " - Action: " + action);
        device.performAction(action);
    }
}


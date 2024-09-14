public class Guest extends User {
    public Guest(String name) {
        super(name, "Guest");
    }

    @Override
    public void controlDevice(Device device, String action) {
        if (device.getRoom().equalsIgnoreCase("common")) {
            System.out.println(name + " (Guest) is controlling the device: " + device.getName() + " - Action: " + action);
            device.performAction(action);
        } else {
            System.out.println(name + " (Guest) does not have access to this device.");
        }
    }
}


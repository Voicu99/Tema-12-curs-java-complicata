public class FamilyMember extends User {
    public FamilyMember(String name) {
        super(name, "FamilyMember");
    }

    @Override
    public void controlDevice(Device device, String action) {
        System.out.println(name + " (FamilyMember) is controlling the device: " + device.getName() + " - Action: " + action);
        device.performAction(action);
    }
}


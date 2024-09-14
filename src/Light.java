public class Light extends Device {
    private boolean isOn;

    public Light(String name, String room) {
        super(name, room);
        this.isOn = false;
    }

    @Override
    public void performAction(String action) {
        if (action.equalsIgnoreCase("turn on")) {
            this.isOn = true;
            System.out.println(name + " in " + room + " is now ON.");
        } else if (action.equalsIgnoreCase("turn off")) {
            this.isOn = false;
            System.out.println(name + " in " + room + " is now OFF.");
        }
    }
}


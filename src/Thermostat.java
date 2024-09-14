public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name, String room, int temperature) {
        super(name, room);
        this.temperature = temperature;
    }

    @Override
    public void performAction(String action) {
        if (action.startsWith("set temperature to")) {
            String[] parts = action.split(" ");
            this.temperature = Integer.parseInt(parts[3]);
            System.out.println(name + " in " + room + " is set to " + temperature + " degrees.");
        }
    }
}


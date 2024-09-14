public class Door extends Device {
    private boolean isLocked;

    public Door(String name, String room) {
        super(name, room);
        this.isLocked = false;
    }

    @Override
    public void performAction(String action) {
        if (action.equalsIgnoreCase("lock")) {
            this.isLocked = true;
            System.out.println(name + " in " + room + " is now LOCKED.");
        } else if (action.equalsIgnoreCase("unlock")) {
            this.isLocked = false;
            System.out.println(name + " in " + room + " is now UNLOCKED.");
        }
    }
}


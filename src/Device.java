public abstract class Device {
    protected String name;
    protected String room;
    protected String status;

    public Device(String name, String room) {
        this.name = name;
        this.room = room;
        this.status = "OK";
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public abstract void performAction(String action);
}


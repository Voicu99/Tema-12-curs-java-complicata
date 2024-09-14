public class Camera extends Device {
    private boolean isRecording;

    public Camera(String name, String room) {
        super(name, room);
        this.isRecording = false;
    }

    @Override
    public void performAction(String action) {
        if (action.equalsIgnoreCase("start recording")) {
            this.isRecording = true;
            System.out.println(name + " in " + room + " is now RECORDING.");
        } else if (action.equalsIgnoreCase("stop recording")) {
            this.isRecording = false;
            System.out.println(name + " in " + room + " has stopped RECORDING.");
        }
    }
}


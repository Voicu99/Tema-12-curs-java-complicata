public class Maintenance {
    public static void checkDeviceHealth(Device device) {
        System.out.println("Checking health status of " + device.getName() + " in " + device.getRoom());
    }

    public static void scheduleRoutineCheck() {
        System.out.println("Scheduling routine maintenance check for all devices.");
    }
}


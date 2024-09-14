public class Security {
    public static void alertOnBreakIn(Device device) {
        if (device instanceof Door || device instanceof Camera) {
            System.out.println("Security alert: Unauthorized access detected at " + device.getName() + " in " + device.getRoom());
        }
    }
}


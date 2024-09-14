public class EnergyManager {
    public static void monitorDeviceUsage(Device device) {
        System.out.println("Monitoring energy usage for " + device.getName() + " in " + device.getRoom());
    }

    public static void generateMonthlyReport() {
        System.out.println("Generating monthly energy consumption report...");
    }
}


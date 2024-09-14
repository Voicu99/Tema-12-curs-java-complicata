import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create users
        Homeowner homeowner = new Homeowner("Alice");
        FamilyMember familyMember = new FamilyMember("Bob");
        Guest guest = new Guest("Charlie");

        // Create devices
        Light livingRoomLight = new Light("Living Room Light", "Living Room");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat", "Living Room", 20);
        Door frontDoor = new Door("Front Door", "Entry");
        Camera securityCamera = new Camera("Security Camera", "Front Yard");

        // User controls devices
        homeowner.controlDevice(livingRoomLight, "turn on");
        familyMember.controlDevice(livingRoomThermostat, "set temperature to 22");
        guest.controlDevice(frontDoor, "unlock");  // Guest should not be able to unlock
        guest.controlDevice(livingRoomLight, "turn off");

        // Create and activate scene
        Scene nightMode = new Scene("Night Mode", Arrays.asList(livingRoomLight, livingRoomThermostat, frontDoor));
        nightMode.activateScene();

        // Weather and news integration
        System.out.println("Weather forecast: " + WeatherIntegration.getWeatherForecast());
        System.out.println("News update: " + NewsIntegration.getBreakingNews());

        // Energy management
        EnergyManager.monitorDeviceUsage(livingRoomLight);
        EnergyManager.generateMonthlyReport();

        // Security alerts
        Security.alertOnBreakIn(frontDoor);

        // Voice commands
        VoiceCommand.processVoiceCommand(homeowner, livingRoomLight, "turn off");

        // Maintenance
        Maintenance.checkDeviceHealth(livingRoomLight);
        Maintenance.scheduleRoutineCheck();
    }
}

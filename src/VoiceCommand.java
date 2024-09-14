public class VoiceCommand {
    public static void processVoiceCommand(User user, Device device, String command) {
        System.out.println(user.getName() + " says: " + command);
        user.controlDevice(device, command);
    }
}


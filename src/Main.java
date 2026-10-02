import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     

        // Create an instance of LegacyFirewall
        LegacyFirewall legacyFirewall = new LegacyFirewall();
        
        // Create an instance of FirewallAdapter, passing the LegacyFirewall instance
        SecurityLog firewallAdapter = new FirewallAdapter(legacyFirewall);
        
         // Create an instance of UserAccessManager
        UserAccessManager userAccessManager = new UserAccessManager();

        NetworkTrafficController networkTrafficController = new NetworkTrafficController();

        EncryptionService encryptionService = new EncryptionService();

        CommandCenterFacade commandCenterFacade = new CommandCenterFacade(userAccessManager, networkTrafficController, encryptionService);
        
        System.out.println("Enter a security event to log:");

        String securityEvent = scanner.nextLine();

        System.out.println("Enter the severity level:");
        int severity = scanner.nextInt();

        firewallAdapter.logEvent(securityEvent);
        firewallAdapter.setSeverity(severity);
    
        System.out.println("Choose an option: 1. Lockdown 2. Lift Lockdown 3. Maintenance");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                commandCenterFacade.initiateEmergencyLockdown();
                break;
            case 2:
                commandCenterFacade.liftEmergencyLockdown();
                break;
            case 3:
                commandCenterFacade.enableMaintenanceMode();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    
}
}
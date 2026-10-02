import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LegacyFirewall
        LegacyFirewall legacyFirewall = new LegacyFirewall();
        
        // Create an instance of FirewallAdapter, passing the LegacyFirewall instance
        SecurityLog firewallAdapter = new FirewallAdapter(legacyFirewall);
        
         // Create an instance of UserAccessManager
        UserAccessManager userAccessManager = new UserAccessManager();

        NetworkTrafficController networkTrafficController = new NetworkTrafficController();

        EncryptionService encryptionService = new EncryptionService();

        // Use the adapter to log events and set severity
        firewallAdapter.logEvent("Unauthorized access attempt detected.");
        firewallAdapter.setSeverity(5);


        networkTrafficController.blockPort(8080);
        networkTrafficController.blockPort(443);

        userAccessManager.lockUserAccounts(List.of("admin_temp", "guest_user_1", "service_acct"));
    
        encryptionService.encryptDatabase("Customer_Records");
        
        networkTrafficController.divertTraffic();

        networkTrafficController.unblockPort(8080);
        networkTrafficController.unblockPort(443);

        userAccessManager.unlockUserAccounts(List.of("admin_temp", "guest_user_1", "service_acct"));

        encryptionService.decryptDatabase("Customer_Records");

    }
}
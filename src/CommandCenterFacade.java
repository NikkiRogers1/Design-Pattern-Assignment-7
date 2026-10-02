
import java.util.List;
public class CommandCenterFacade {
     private UserAccessManager userAccessManager;
    private NetworkTrafficController networkTrafficController;
    private EncryptionService encryptionService;

    public CommandCenterFacade(UserAccessManager userAccessManager, NetworkTrafficController networkTrafficController, EncryptionService encryptionService) {

        this.userAccessManager = userAccessManager;
        this.networkTrafficController = networkTrafficController;
        this.encryptionService = encryptionService;
    }

    public void initiateEmergencyLockdown() {
        networkTrafficController.blockPort(8080);
        networkTrafficController.blockPort(443);
        userAccessManager.lockUserAccounts(List.of("admin_temp", "guest_user_1", "service_acct"));
        encryptionService.encryptDatabase("Customer_Records");
    }
    public void liftEmergencyLockdown() {
        networkTrafficController.unblockPort(8080);
        networkTrafficController.unblockPort(443);
        userAccessManager.unlockUserAccounts(List.of("admin_temp", "guest_user_1", "service_acct"));
        encryptionService.decryptDatabase("Customer_Records");
    }
    public void enableMaintenanceMode() {
        networkTrafficController.divertTraffic();
        userAccessManager.grantAdminAccess("AdminUser");
        encryptionService.verifyIntegrity();

    }
}

import java.util.List;

public class UserAccessManager {
    void lockUserAccounts(List<String> usernames) {
        System.out.println("Locking user accounts: " + usernames);
    }
    void unlockUserAccounts(List<String> usernames) {
        System.out.println("Unlocking user accounts: " + usernames);
    }
    void grantAdminAccess(String user) {
        System.out.println("Granting admin access to user: " + user);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of LegacyFirewall
        LegacyFirewall legacyFirewall = new LegacyFirewall();
        
        // Create an instance of FirewallAdapter, passing the LegacyFirewall instance
        SecurityLog firewallAdapter = new FirewallAdapter(legacyFirewall);
        
        // Use the adapter to log events and set severity
        firewallAdapter.logEvent("Unauthorized access attempt detected.");
        firewallAdapter.setSeverity(5);
    }
}

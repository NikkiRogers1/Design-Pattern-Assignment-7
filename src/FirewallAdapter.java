public class FirewallAdapter implements SecurityLog {
    //field to hold the instance of LegacyFirewall
    private LegacyFirewall legacyFirewall;
//Constructor that takes LegacyFirewall as a parameter and initializes the legacyFirewall field
    public FirewallAdapter(LegacyFirewall legacyFirewall) {
        this.legacyFirewall = legacyFirewall;
    }
    //methods to implement the SecurityLog interface
    @Override 
    public void logEvent(String event) {
        //Delegating the call to the recordActivity method of LegacyFirewall
        legacyFirewall.recordActivity(event);
    }
    // method to implement the setSeverity method of SecurityLog interface
    @Override
    public void setSeverity(int severity) {
        //Delegating the call to the setAlertLevel method of LegacyFirewall
        legacyFirewall.setAlertLevel(severity);
    }
}

public interface SecurityLog {
    void logEvent(String event);
    
    void setSeverity(int severity);
  
}
# Journal
 Phase 1-

The Adapter Pattern follows the Principle of Least Knowledge because in Main, the SecurityLog doesn't need to know what the LegacyFirewall uses. It just needs to know that the adapter knows what to do. It's better for the main dashboard to talk to a SecurityLog rather than having to know about the LegacyFirewall directly because SecurityLog is the new system. Instead of having all of the old system's details in the new code, the adapter handles those details for the new system.

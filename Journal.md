# Journal
 Phase 1-

The Adapter Pattern follows the Principle of Least Knowledge because in Main, the SecurityLog doesn't need to know what the LegacyFirewall uses. It just needs to know that the adapter knows what to do. It's better for the main dashboard to talk to a SecurityLog rather than having to know about the LegacyFirewall directly because SecurityLog is the new system. Instead of having all of the old system's details in the new code, the adapter handles those details for the new system.

Phase 2 -
When I implemented the "All-Clear" sequence, I kept track of which ports and users needed to be restored by looking back at what I did. If the system grew to 1,000 ports or 10,000 users, this manual approach would be lengthy, and you would have to remember a lot of users. That would be dangerous or impossible because things could get lost or forgotten.

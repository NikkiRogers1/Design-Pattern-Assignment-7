# Journal
 Phase 1-

The Adapter Pattern follows the Principle of Least Knowledge because in Main, the SecurityLog doesn't need to know what the LegacyFirewall uses. It just needs to know that the adapter knows what to do. It's better for the main dashboard to talk to a SecurityLog rather than having to know about the LegacyFirewall directly because SecurityLog is the new system. Instead of having all of the old system's details in the new code, the adapter handles those details for the new system.

Phase 2 -
When I implemented the "All-Clear" sequence, I kept track of which ports and users needed to be restored by looking back at what I did. If the system grew to 1,000 ports or 10,000 users, this manual approach would be lengthy, and you would have to remember a lot of users. That would be dangerous or impossible because things could get lost or forgotten.

Phase 3-
In Phase 2, the Facade moved all the complicated steps out of Main and put them into one simple method. In Phase 3, the Facade makes the All-Clear easier because I don't have to remember and write out every step in Main. I can just call one method that handles everything.

If the NetworkTrafficController was replaced with another vendor's version, Main would not need to change because Main is using the Facade instead of directly calling the NetworkTrafficController. The Facade would handle the changes behind the scenes.

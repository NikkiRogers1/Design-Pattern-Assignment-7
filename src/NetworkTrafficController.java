public class NetworkTrafficController {
    void blockPort(int port) {
        System.out.println("Blocking port: " + port);
    }   
    void unblockPort(int port) {
    System.out.println("Unblocking port: " + port);

    }
    void divertTraffic() {
        System.out.println("Diverting traffic to Honeypot.");
    }
    void monitorPacketLoss() {
        System.out.println("Monitoring packet loss in the network.");
    }
}


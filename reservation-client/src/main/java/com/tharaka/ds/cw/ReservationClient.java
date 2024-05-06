package com.tharaka.ds.cw;

public class ReservationClient {
    public static void main( String[] args ) throws InterruptedException {
        String host = args[0];
        int port = Integer.parseInt(args[1].trim());
        String operation = args[2];

        if (args.length != 3) {
            System.out.println("Usage ReservationClient <host> <port> <(u)ser|(i)tem|c(heck)>");
            System.exit(1);
        }

        if ("u".equals(operation)) {
            UserAddServiceClient client = new UserAddServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        } else if ("i".equals(operation)) {
            ItemAddServiceClient client = new ItemAddServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        } else {
            ItemGetServiceClient client = new ItemGetServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        }
    }
}

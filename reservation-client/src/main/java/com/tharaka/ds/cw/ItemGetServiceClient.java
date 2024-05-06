package com.tharaka.ds.cw;

import common.tharaka.ds.cw.communication.grpc.generated.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class ItemGetServiceClient {
    private ManagedChannel channel = null;
    ItemSearchServiceGrpc.ItemSearchServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public ItemGetServiceClient (String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = ItemSearchServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter your username :");
            String userName =   userInput.nextLine().trim();
            System.out.println("Requesting server to get items by " + userName);
            UserRequest request = UserRequest
                    .newBuilder()
                    .setUserName(userName)
                    .build();
            ItemGetAllResponse response = clientStub.getAllItems(request);
            for (ItemDTO item : response.getItemsList()) {
                System.out.println("Item Name : " + item.getItemName());
                System.out.println("Type : " + item.getType());
                System.out.println("Price : " + item.getPrice());
                System.out.println("Available Quantity : " + item.getAvailableQuantity());
                System.out.println("Seller Name : " + item.getSellerName());
                System.out.println("=====================================");
            }
            Thread.sleep(1000);
        }
    }
}

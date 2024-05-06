package com.tharaka.ds.cw;

import common.tharaka.ds.cw.communication.grpc.generated.*;

import java.util.List;

public interface DataProvider {
    void addItem(ItemAddRequest itemAddRequest);
    void updateItem(ItemUpdateRequest itemUpdateRequest);
    void deleteItem(String itemId);

    List<Item> getItemsBySellerName(String name);
    List<ItemDTO> getAllItems(String name);
    boolean isItemExist(String itemId);

    void addReservation(Reservation reservation);
    List<Reservation> getReservationsByUserName(String username);

    void addUser(UserAddRequest userAddRequest);
    boolean isUserExist(String username);
    User getUser(String username);
}

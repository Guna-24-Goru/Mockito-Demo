package com.mockitoPratice.MockitoPartice.bo;

import com.mockitoPratice.MockitoPartice.dat.Order;

import java.sql.SQLException;

public interface OrderBo {
    boolean placeOrder(Order order) throws SQLException;
    boolean cancelOrder(int id ) throws  SQLException;
    boolean deleteOrder(int id )throws  SQLException;

}

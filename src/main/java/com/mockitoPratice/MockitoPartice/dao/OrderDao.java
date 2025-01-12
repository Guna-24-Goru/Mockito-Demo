package com.mockitoPratice.MockitoPartice.dao;



import com.mockitoPratice.MockitoPartice.dat.Order;

import java.sql.SQLException;

public interface OrderDao {

    int create(Order order) throws SQLException;

    com.mockitoPratice.MockitoPartice.dat.Order read(int id) throws  SQLException;

    int update(Order order) throws  SQLException;

    int delete(int id ) throws  SQLException;
}

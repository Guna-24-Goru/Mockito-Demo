package com.mockitoPratice.MockitoPartice.dao;
import com.mockitoPratice.MockitoPartice.dat.Order;
import java.sql.SQLException;

public class OrderDAOImpl implements  OrderDao {

    @Override
    public int create(Order order) throws SQLException {
        return 0;
    }

    @Override
    public Order read(int id) throws SQLException {
        return null;
    }

    @Override
    public int update(Order order) throws SQLException {
        return 0;
    }

    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }
}

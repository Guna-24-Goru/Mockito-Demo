package com.mockitoPratice.MockitoPartice.bo;
import com.mockitoPratice.MockitoPartice.dat.Order;

import com.mockitoPratice.MockitoPartice.dao.OrderDao;

import java.sql.SQLException;

public class OrderBoImpl implements  OrderBo{
    private OrderDao dao;
    public OrderDao getDao() {
        return dao;
    }

    public void setDao(OrderDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean placeOrder(Order order) throws SQLException {
        try{
            int result=dao.create(order);
            if(result==0){
                return  false;
            }
        }catch (Exception e){
            throw new SQLException();
        }
        return true;
    }

    @Override
    public boolean cancelOrder(int id) throws SQLException {
        try{
            Order order= dao.read(id);
            order.setStatus("Cancelled");
            int result= dao.update(order);
            if(result==0){
                return  false;
            }
        }catch(Exception e){
            throw  new SQLException();
        }
        return true;
    }

    @Override
    public boolean deleteOrder(int id) throws SQLException {
        return false;
    }
}

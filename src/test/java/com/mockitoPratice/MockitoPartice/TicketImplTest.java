package com.mockitoPratice.MockitoPartice;

import com.mockitoPratice.MockitoPartice.bo.OrderBoImpl;
import com.mockitoPratice.MockitoPartice.dao.OrderDao;
import com.mockitoPratice.MockitoPartice.dat.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class TicketImplTest {
    private OrderBoImpl bo;
    @Mock
    private OrderDao dao;
    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
        bo= new OrderBoImpl();
        bo.setDao(dao);
    }
    @Test
    public  void placeOrderShouldCreateOrder() throws SQLException {
        Order order =new Order();
        when(dao.create(order)).thenReturn(1);
        boolean result =bo.placeOrder(order);
        assertTrue(result);
    }
    @Test
    public  void placeOrderShouldNotCreateOrder() throws SQLException {
        Order order =new Order();
        when(dao.create(order)).thenReturn(0);
        boolean result =bo.placeOrder(order);
        assertFalse(result);
    }
    @Test
    public  void cancelOrderShouldCreateOrder() throws SQLException {
        Order order =new Order();
        when(dao.read(1234)).thenReturn(order);
        when(dao.update(order)).thenReturn(1);
        boolean result =bo.cancelOrder(1234);
        assertTrue(result);
    }
    @Test
    public  void cancelOrderShouldNotCreateOrder() throws SQLException {
        Order order =new Order();
        when(dao.read(12)).thenReturn(order);
        when(dao.update(order)).thenReturn(0);

        boolean result =bo.cancelOrder(12);
        assertFalse(result);
    }
    @Test
    public  void placeOrderShouldThrowException() throws SQLException{
        Order order= new Order();
        when(dao.create(order)).thenThrow(SQLException.class);

        assertThrows(SQLException.class,()->{
            bo.placeOrder(order);
        });
    }





}

package com.mockitoPratice.MockitoPartice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumpationThat {
   private  int addNumbers(int a ,int b){
       return a+b;
   }
   @Test
    public  void testAddition(){
       int num1 =5;
       int num2=10;
       assumingThat(num1>0 && num2>0,()->{
           System.out.println("It is correct");
           int sum =addNumbers(num1,num2);
           assertEquals(15,sum);
       });
   }
   @Test
   public void testTrue(){
       int a =10;
       int b =20;
       assumeTrue(a>0 && b>0);
       System.out.println("It is True....");
       int sum=a+b;
       assertEquals(30,sum);
   }
    @Test
    public void testFalse(){
        int a =10;
        int b =20;
        assumeFalse(a<0 && b<0);
        System.out.println("It is False....");
        int sum=a+b;
        assertEquals(30,sum);
    }

}

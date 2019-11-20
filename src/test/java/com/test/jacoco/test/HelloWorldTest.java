package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	int b = hw.Method3(6, 2, 1);
    	int c = hw.Method3(5, -1, 1);
    	int d = hw.Method3(6, 2, -1);
    	int e = hw.Method3(4, -1, -3);
    	int f = hw.Method3(4, -1, -1);
    }
    @Test
    public void testMethod4(){
        try {
            HelloWorld hw = new HelloWorld();
            hw.Method4(0, -1, -1, -1, -1);
            hw.Method4(3, 3, -1, -2, -3);//
            hw.Method4(3, 3, 5, 5, -3);
            hw.Method4(5, 3, 5, 5, -3);//
            hw.Method4(4, 3, 5, 5, -3);//
            hw.Method4(5, 4, 5, 3, -1);
            hw.Method4(3, 4, 5, 3, -1);

        }catch (Exception e){
            //e.printStackTrace();
        }
    }
    @Test
    public void testIsTriangle(){
        HelloWorld hw = new HelloWorld();
        hw.isTriangle(-1, 0, 0);
        hw.isTriangle(1, -1, 0);
        hw.isTriangle(1,1,-1);
        hw.isTriangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        hw.isTriangle(3, 2, 1);
        hw.isTriangle(1,1,3);
        hw.isTriangle(2,3,4);
    }
    @Test
    public void testIsBirthday(){
        HelloWorld hw = new HelloWorld();
        // year false
        hw.isBirthday(1,0,0);
        hw.isBirthday(10000,0,0);
        // month false
        hw.isBirthday(1999, -1,0);
        hw.isBirthday(1999, 13, 0);
        // day false
        hw.isBirthday(1999, 12, 0);
        //month == 2 false
        hw.isBirthday(1999, 2, 29);
        hw.isBirthday(2004, 2, 30);
        hw.isBirthday(2000, 2, 29);
        //month == 2 true
        hw.isBirthday(1999, 2, 28);
        hw.isBirthday(2004, 2, 29);
        hw.isBirthday(2000, 2, 28);

        //big month false
        hw.isBirthday(2001, 1, 32);
        hw.isBirthday(2001, 3, 32);
        hw.isBirthday(2001, 5, 32);
        hw.isBirthday(2001, 7, 32);
        hw.isBirthday(2001, 8, 32);
        hw.isBirthday(2001, 10, 32);
        hw.isBirthday(2001, 12, 32);

        hw.isBirthday(2001, 1, 31);
        hw.isBirthday(2001, 3, 31);
        hw.isBirthday(2001, 5, 31);
        hw.isBirthday(2001, 7, 31);
        hw.isBirthday(2001, 8, 31);
        hw.isBirthday(2001, 10, 31);
        hw.isBirthday(2001, 12, 31);

        //small month
        hw.isBirthday(2001, 4, 31);
        hw.isBirthday(2001, 6, 31);
        hw.isBirthday(2001, 9, 31);
        hw.isBirthday(2001, 11, 31);

        hw.isBirthday(2001, 4, 30);
        hw.isBirthday(2001, 6, 30);
        hw.isBirthday(2001, 9, 30);
        hw.isBirthday(2001, 11, 30);
        // up bound
        hw.isBirthday(2019, 10, 2);
        hw.isBirthday(2019, 11, 1);
        hw.isBirthday(2019, 10, 1);
        hw.isBirthday(2019, 9, 30);
    }
    @Test
    public void testMiniCalculator(){
        HelloWorld hw = new HelloWorld();
        try {
            //hw.miniCalculator(0, 0, '+');
            assertEquals(1.2 + 1.3, hw.miniCalculator(1.2, 1.3, '+'), 1e-6);
            assertEquals(1.2 - 1.3, hw.miniCalculator(1.2, 1.3, '-'), 1e-6);
            assertEquals(1.2 * 1.3, hw.miniCalculator(1.2, 1.3, '*'), 1e-6);
            assertEquals(1.2 / 1.3, hw.miniCalculator(1.2, 1.3, '/'), 1e-6);
        }catch (Exception e) {
            assert false;
        }

        try{
            hw.miniCalculator(1.2,1.3,'?');
            assert false;
        }catch (Exception e){
            assertEquals(e.getMessage(), "no such operation");
        }
        try{
            hw.miniCalculator(Double.MAX_VALUE, 10, '+');
            assert false;
        }catch (Exception e){
            assertEquals(e.getMessage(), "add overflow");
        }
        try{
            hw.miniCalculator(Double.MIN_VALUE, 10, '-');
            assert false;
        }catch (Exception e){
            assertEquals(e.getMessage(), "minus overflow");
        }
        try{
            hw.miniCalculator(Double.MAX_VALUE, 10, '*');
        }catch (Exception e){
            assertEquals(e.getMessage(), "multiply overflow");
        }
        try{
            hw.miniCalculator(Double.MAX_VALUE, 0.1, '/');
        }catch (Exception e){
            assertEquals(e.getMessage(), "divide overflow");
        }
        try{
            hw.miniCalculator(13.3, 0, '/');
        }catch (Exception e){
            assertEquals(e.getMessage(), "divide zero error");
        }

    }
}

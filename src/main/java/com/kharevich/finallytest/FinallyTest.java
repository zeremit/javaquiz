package com.kharevich.finallytest;

/**
 * Created by zeremit on 27.1.15.
 */
public class FinallyTest {

    public static void main(String[] args) {
        System.out.println(getInt());
    }

    private static int getInt(){
        try{
            return 5;
        }finally {
            return 10;
        }
    }
}

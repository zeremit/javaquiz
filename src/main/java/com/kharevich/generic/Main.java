package com.kharevich.generic;

/**
 * Created by zeremit on 9/13/17.
 */
public class Main {

  public static void main(String[] args) {
    Interface object = new InterfaceImpl(10);
    Pair value = object.get();
    Object first = value.getFirstItem();
  }
}

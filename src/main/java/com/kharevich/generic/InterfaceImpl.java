package com.kharevich.generic;

/**
 * Created by zeremit on 9/13/17.
 */
public class InterfaceImpl implements Interface<ObjectInterfaceImpl> {

  public InterfaceImpl(int value) {
    this.value = new Pair(new ObjectInterfaceImpl(), new ObjectInterfaceImpl());
  }

  private Pair<ObjectInterfaceImpl> value;

  public Pair<ObjectInterfaceImpl> get() {
    return value;
  }
}

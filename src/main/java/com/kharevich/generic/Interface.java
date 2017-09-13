package com.kharevich.generic;

/**
 * Created by zeremit on 9/13/17.
 */
public interface Interface<T extends ObjectInterface>{

  Pair<T> get();
}

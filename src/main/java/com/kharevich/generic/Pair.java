package com.kharevich.generic;

public class Pair<T> {
  
  /** The first item. */
  private T firstItem;
  
  /** The second item. */
  private T secondItem;
  
  /**
   * Instantiates a new empty pair.
   */
  public Pair() {
    super();
  }
  
  
  /**
   * Instantiates a new pair with the provided names.
   *
   * @param firstItem the first item.
   * @param secondItem the second item.
   */
  public Pair(T firstItem, T secondItem) {
    this.firstItem = firstItem;
    this.secondItem = secondItem;
  }
  
  
  /**
   * Gets the first item.
   *
   * @return the first item
   */
  public T getFirstItem() {
    return firstItem;
  }
  
  
  /**
   * Gets the second item.
   *
   * @return the second item
   */
  public T getSecondItem() {
    return secondItem;
  }
  
  
  /**
   * Sets the first item.
   *
   * @param startToken the new first item
   */
  public void setFirstItem(T startToken) {
    this.firstItem = startToken;
  }
  
  
  /**
   * Sets the second item.
   *
   * @param endToken the new second item
   */
  public void setSecondItem(T endToken) {
    this.secondItem = endToken;
  }
}
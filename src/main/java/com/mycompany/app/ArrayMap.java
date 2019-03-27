package com.mycompany.app;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayMap<K,V> extends AbstractMap<K,V> {
  private Object[] keyArray;
  private Object[] valueArray;

  public ArrayMap() {
    this.keyArray = new Object[1];
    this.valueArray = new Object[1];
  }

  public ArrayMap(int capacity) {
    this.keyArray = new Object[capacity];
    this.valueArray = new Object[capacity];
  }

  @Override
  public Set<Map.Entry<K,V>> entrySet() {
    Set<Map.Entry<K,V>> entrySet = new HashSet<>();
    for (int i = 0; i < keyArray.length; i++) {
      if (keyArray[i] != null);
        entrySet.add(new AbstractMap.SimpleEntry<>((K)keyArray[i], (V)valueArray[i]));
    }

    return entrySet;
  }
}

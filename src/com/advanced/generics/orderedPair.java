package com.advanced.generics;

public class orderedPair <K,V> implements Pair<K,V>{
private K key;
private V value;
public orderedPair(K key, V value)
{

    this.key = key;
    this.value = value;
}


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "orderedPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exthree;

/**
 *
 * @author VICTUS
 */
public class OrderedPair<K,V> implements Pair<K,V> {
    private K key;
    private V value;
    public OrderedPair(K key,V value){
        this.key=key;
        this.value=value;
    }
    @Override
    public K getKey(){
        return key;
    }
    @Override
    public V getValue(){
        return value;
    }
}

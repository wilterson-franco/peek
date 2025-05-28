package com.wilterson.peek;

import java.util.LinkedList;
import java.util.List;

public class Peek {

    public static void main(String[] args) {

        List<Node<String, String>> myList = new LinkedList<>();

        myList.add(new Node<>("1", "One"));
        myList.add(new Node<>("2", "Two"));
        myList.add(new Node<>("3", "Three"));

        myList.stream().peek(node -> System.out.println("Key: " + node.k + " Value: " + node.v)).toList();
    }

    private record Node<K,V>(K k, V v) {
    }
}

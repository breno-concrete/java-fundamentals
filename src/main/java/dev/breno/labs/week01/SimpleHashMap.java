package dev.breno.labs.week01;

import static java.lang.Math.floorMod;

public class SimpleHashMap<K, V> {

    private int size;

    private Node<K, V>[] buckets = new Node[4];


    public V get(K key) {
        int idx = bucketIndex(key);

        Node<K, V> current = buckets[idx];

        while (current != null) {
            if (current.key.equals(key)){
                return current.value;
            }

            current = current.nextNode;
        }

        return null;
    }

    public void put(K key, V value) {
        int idx = bucketIndex(key);

        Node<K, V> node = new Node<K, V>(key, value);

        if (buckets[idx] == null) {
            buckets[idx] = node;
            size++;
        } else {
            Node<K, V> current = buckets[idx];

            while(current != null){
                if ((buckets[idx].key).equals(node.key)) {
                    buckets[idx].value = node.value;
                    return;
                }
                if (current.nextNode == null) {
                    current.nextNode = node;
                    size++;
                    return;
                }

                current = current.nextNode;


            }



        }

    }

    public int getSize() {
        return size;
    }
    private int bucketIndex(K key) {
        int keyHash = key.hashCode();

        return floorMod(keyHash, buckets.length);

    }

    private static class Node<K, V> {

        private Node<K, V> nextNode;

        private K key;

        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.nextNode = null;
        }
    }



}



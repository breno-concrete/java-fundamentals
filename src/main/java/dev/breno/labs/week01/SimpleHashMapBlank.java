package dev.breno.labs.week01;

import static java.lang.Math.floorMod;

public class SimpleHashMapBlank<K, V> {

    private int size;


    private Node[] buckets = new Node[4];


    public int getSize(){
        return this.size;
    }

    public int getCapacity(){
        return buckets.length;
    }


    public void put(K key, V value) {

        int hashCode = key.hashCode();
        int idx = floorMod(hashCode, buckets.length);

        Node<K, V> node = new Node<K, V>(key, value);



        if (buckets[idx] == null) {
            buckets[idx] = node;
            size++;
            resize();

        } else {

            Node<K, V> current = findFirstNode(key);

            while (current != null) {
                if(current.key.equals(key)){
                    current.key = key;
                    current.value = value;
                    return;
                }

                if (current.nextNode == null){
                    current.nextNode = node;
                    size++;
                    resize();
                    return;
                }

                current = current.nextNode;

            }



        }

    }

    private void resize() {
        if (size > (buckets.length * 0.75)) {

            Node<K, V>[] oldBuckets = buckets;

            buckets = new Node[buckets.length * 2];

            size = 0;

            for (int i = 0; i < oldBuckets.length; i++) {

                Node<K, V> current = oldBuckets[i];

                while (current != null) {

                    put(current.key, current.value);

                    current = current.nextNode;

                }
            }

        }

    }

    public V get(K key){


        Node<K, V> current = findFirstNode(key);

        while (current != null){
            if (key.equals(current.key)){
                return current.value;
            }

            current = current.nextNode;
        }

        return null;

    }

    private Node<K, V> findFirstNode(K key){
        int hashCode = key.hashCode();
        int idx = floorMod(hashCode, buckets.length);

        return buckets[idx];

    }



    public static class Node<K, V> {

        public Node(K key, V value) {
            this.value = value;
            this.key = key;
        }

        private K key;

        private V value;

        private Node<K, V> nextNode;
    }
}

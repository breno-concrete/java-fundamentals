package dev.breno.labs.week02;

public class DynamicArray {

    private int size = 0;

    private int[] array = new int[size];

    public int size(){
        return size;
    }

    public void add(int number) {



        if (size == array.length){

            if (array.length == 0) {
                array = new int[2];
                array[0] = number;

            } else {

                int[] oldArray = array;

                array = new int[array.length*2];

                for (int i = 0; i < size; i++) {
                    array[i] = oldArray[i];
                }

            }

        }

        array[size] = number;
        size++;
    }

    public int get(int index){
        return array[index];
    }
}

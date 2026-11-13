package dev.breno.labs.week02;

import java.util.ArrayList;
import java.util.LinkedList;

public class InsertLab {

    public static void main(String[] args) {

        //==========================================================================================

        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long elapsed = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("ArrayList end: " + elapsed + "ms (size 100000)");



        LinkedList<Integer> linkedList = new LinkedList<>();

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        elapsed = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("LinkedList end: " + elapsed + "ms (size 100000)");
//===================================================================================================================
        System.out.println();

        arrayList = new ArrayList<>();

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        elapsed = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("ArrayList beginning: " + elapsed + "ms (size 100000)");


        linkedList = new LinkedList<>();

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        elapsed = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("LinkedList beginnig: " + elapsed + "ms (size 100000)");

//=================================================================================================================
        System.out.println();

        arrayList = new ArrayList<>();

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        elapsed = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("ArrayList middle: " + elapsed + "ms (size 100000)");


        linkedList = new LinkedList<>();

        start = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        elapsed = ((System.nanoTime() - start) / 1_000_000);

        System.out.println("LinkedList middle: " + elapsed + "ms (size 100000)");


    }


}

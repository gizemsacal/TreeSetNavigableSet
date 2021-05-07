package com.company;

import java.util.NavigableSet;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {
        // Creating NavigableSet using the TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("NavigableSet: " + numbers);

        // Access the first element
        int firstElement = numbers.first();
        System.out.println("ilk Eleman: " + firstElement);

        // Access the last element
        int lastElement = numbers.last();
        System.out.println("Son Elemen: " + lastElement);

        // Remove the first element
        int number1 = numbers.pollFirst();
        System.out.println("Kaldırılan İlk Eleman: " + number1);

        // Remove the last element
        int number2 = numbers.pollLast();
        System.out.println("Kaldırılan Son Eleman: " + number2);

    }
}
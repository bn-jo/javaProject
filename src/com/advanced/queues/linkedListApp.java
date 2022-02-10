package com.advanced.queues;

import java.util.LinkedList;
import java.util.Queue;

public class linkedListApp {

    public static void main(String[] args) {
        Queue<Integer> bankQueueNumbers = new LinkedList<>();
        bankQueueNumbers.add(30);
        bankQueueNumbers.add(31);
        bankQueueNumbers.add(32);
        bankQueueNumbers.add(33);
        bankQueueNumbers.add(34);
        System.out.println(bankQueueNumbers);
        System.out.println("First customer queue :"+bankQueueNumbers.element());
        System.out.println("Customer with number "+bankQueueNumbers.remove()+"is called");
        System.out.println(bankQueueNumbers);
        bankQueueNumbers.remove(33);
        System.out.println("Customer with number 33 removed");
        System.out.println(bankQueueNumbers);
    }
}

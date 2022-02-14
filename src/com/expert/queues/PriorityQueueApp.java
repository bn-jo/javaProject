package com.expert.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp {

    public static void main(String[] args) {


        Queue<Integer> bankQueueNumbers = new PriorityQueue<>();
        bankQueueNumbers.add(34);
        bankQueueNumbers.offer(32);
        bankQueueNumbers.offer(31);
        bankQueueNumbers.offer(33);
        bankQueueNumbers.offer(30);
        System.out.println(bankQueueNumbers);
        System.out.println("First customer queue :"+bankQueueNumbers.element());
        System.out.println("Customer with number "+bankQueueNumbers.remove()+" is called");
        System.out.println(bankQueueNumbers);
        System.out.println("Customer with number "+bankQueueNumbers.poll()+" is called");
        System.out.println(bankQueueNumbers);


        bankQueueNumbers.remove(33);
        System.out.println("Customer with number 33 removed");
        System.out.println(bankQueueNumbers);
    }
    }

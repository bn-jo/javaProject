package com.expert.queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithLinkedListApp {
    public static void main(String[] args) {

        Deque<String> editHistory = new LinkedList<>();
        System.out.println("taking action : making the text bold");
        editHistory.push("making the text bold");
        System.out.println("taking action : making the text bold");
        editHistory.push("adding some text");
        System.out.println("taking action : adding new paragraph");
        editHistory.push(" making the text bold");
        System.out.println();
        System.out.println("last action in our edit history"+editHistory.peek());
        System.out.println("Undoing the last action: "+ editHistory.pop());
        System.out.println("Undoing the last action: "+ editHistory.pop());
        System.out.println();
        System.out.println("Edit History"+editHistory.pop());



    }
}

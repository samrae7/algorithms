package com.company;

import java.util.Hashtable;

public class LinkedListAnswers {
    public static Node removeDuplicates(Node head) {
        Node firstPointer = head;

        while(firstPointer.next != null) {
            Node secondPointer = firstPointer.next;
            while(secondPointer.next != null) {
                if(firstPointer.data == secondPointer.data) {
                    firstPointer.next = firstPointer.next.next;
                }
                secondPointer = secondPointer.next;
            }

        }
        return head;
    }
}

package com.company;

import java.util.Hashtable;

public class LinkedListAnswers {
    public static Node removeDuplicates(Node head) {
        Node n = head;
        Hashtable<Integer, Integer> uniqueValues = new Hashtable<>(2, 1);
        while(n.next != null) {
            uniqueValues.put(n.data, n.data);
            if(uniqueValues.contains(n.next.data)) {
                n.next = n.next.next;
            }
            n = n.next;
        }
        return head;
    }
}

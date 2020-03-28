package com.company;

public class LinkedListAnswers {
    public static Node removeDups(Node head) {
        Node n = head;
        while(n.next != null) {
            if(n.data == n.next.data) {
                n.next = n.next.next;
            }
            n = n.next;
        }
        return head;
    }
}

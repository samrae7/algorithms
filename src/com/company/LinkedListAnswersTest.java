package com.company;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListAnswersTest {
    @Test
    public void shouldRemoveDups() {
        Node linkedList = new Node(1);
        linkedList.appendToTail(2);
        linkedList.appendToTail(2);
        linkedList.appendToTail(3);
        linkedList.appendToTail(4);
        int thirdItem = linkedList.next.next.data;
        Assert.assertEquals(thirdItem, 2);
        LinkedListAnswers.removeDups(linkedList);
        int thirdItemAfterRemoveDups = linkedList.next.next.data;
        Assert.assertEquals(thirdItemAfterRemoveDups, 3);
    }
}
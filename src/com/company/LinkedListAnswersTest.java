package com.company;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListAnswersTest {
    @Test
    public void shouldRemoveDuplicatess() {
        Node linkedList = new Node(1);
        linkedList.appendToTail(2);
        linkedList.appendToTail(2);
        linkedList.appendToTail(3);
        linkedList.appendToTail(4);
        int thirdItem = linkedList.next.next.data;
        Assert.assertEquals(thirdItem, 2);
        LinkedListAnswers.removeDuplicates(linkedList);
        int thirdItemAfterRemoveDups = linkedList.next.next.data;
        Assert.assertEquals(thirdItemAfterRemoveDups, 3);
    }

    @Test
    public void shouldRemoveDuplicatesWhenUnordered() {
        Node linkedList = new Node(4);
        linkedList.appendToTail(2);
        linkedList.appendToTail(3);
        linkedList.appendToTail(2);
        linkedList.appendToTail(1);
        int fourthItem = linkedList.next.next.next.data;
        Assert.assertEquals(fourthItem, 2);
        LinkedListAnswers.removeDuplicates(linkedList);
        int fouthItemAfterRemoveDups = linkedList.next.next.next.data;
        Assert.assertEquals(fouthItemAfterRemoveDups, 1);
    }
}
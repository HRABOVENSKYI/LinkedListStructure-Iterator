package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class PhoneList implements Iterable<Phone> {

    private Node head;

    public PhoneList() {
        this.head = null;
    }

    public void add(Phone phone) {

        Node node = new Node(phone);
        node.next = head;
        head = node;
    }

    public void print() {

        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    @Override
    public Iterator<Phone> iterator() {
        return new PhoneListIterator(head);
    }

    static class PhoneListIterator implements Iterator<Phone> {

        Node node;

        public PhoneListIterator(Node head) {
            this.node = head;
        }


        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Phone next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Phone phone = node.data;
            node = node.next;
            return phone;
        }
    }
}

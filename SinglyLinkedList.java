public record SinglyLinkedList(ListNode root) {

    static SinglyLinkedList addFirst(final SinglyLinkedList list, final int value) {
        return new SinglyLinkedList(new ListNode(value, list.root()));
    }

    static String toString(final SinglyLinkedList list) {
        return toString(list.root());
    }

    static String toString(final ListNode node) {
        if (node == null) {
            return "";
        }
        String head = String.valueOf(node.value());
        String tail = toString(node.next());
        if ("".equals(tail)) {
            return head;
        }
        return head + ", " + tail;
    }

    static SinglyLinkedList addLast(final SinglyLinkedList list, final int value) {
        return new SinglyLinkedList(addLast(list.root(), value));
    }

    static ListNode addLast(final ListNode current, final int value) {
        if (current == null) {
            return new ListNode(value, null);
        }
        return new ListNode(current.value(), addLast(current.next(), value));
    }

    static SinglyLinkedList remove(final SinglyLinkedList list, final int value) {
        return new SinglyLinkedList(remove(list.root(), value));
    }

    static ListNode remove(final ListNode current, final int value) {
        if (current == null) {
            return null;
        }
        if (current.value() == value) {
            return current.next();
        }
        return new ListNode(current.value(), remove(current.next(), value));
    }
    
}

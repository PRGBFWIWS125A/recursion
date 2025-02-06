public record SinglyLinkedList(ListNode root) {

    static SinglyLinkedList addFirst(final SinglyLinkedList list, final int value){
        
        return new SinglyLinkedList(new ListNode(value, list.root));


    }
}


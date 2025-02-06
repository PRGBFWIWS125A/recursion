public record SinglyLinkedList(ListNode root) {

    static SinglyLinkedList addFirst(final SinglyLinkedList list, final int value){
        return new SinglyLinkedList(new ListNode(value, list.root()));
    }
    
    static String toString(final SinglyLinkedList list) {
        return toString(list.root()); 
    }
    
    static String toString(final ListNode node) {
        if ( node == null ) 
            return ""; 
        if (node.next() == null)  
            return String.valueOf(node.value());   
        return String.valueOf(node.value()) + ", " + toString(node.next());
    }
    
}

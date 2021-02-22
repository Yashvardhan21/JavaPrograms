package LinkedList2;

public class InsertionSort {
	public static Node<Integer> insertionSort(Node<Integer> node) { 
        if (node == null) 
        { return null;
          } 
        Node<Integer> sortedList = node; 
        node = node.next;
        sortedList.next = null;
        while (node != null) {
            final Node<Integer> current = node; 
            node = node.next; 
            if (current.data < sortedList.data) {
                current.next = sortedList; 
                sortedList = current; 
            } else { 
                Node<Integer> search = sortedList;
                while (search.next != null && current.data > search.next.data) { 
                    search = search.next;
                } 
                current.next = search.next; 
                search.next = current;
            } 
        } 
        return sortedList; 
    }
}

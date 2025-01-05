import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testInsertAfter() {
        // Step 1: Create and populate the LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);

        // Step 2: Verify initial sequence: 56 -> 30 -> 70
        System.out.println("Initial List:");
        linkedList.display();

        // Step 3: Search for the node with value 30 and insert 40 after it
        linkedList.insertAfter(30, 40);

        // Step 4: Verify the final sequence: 56 -> 30 -> 40 -> 70
        System.out.println("Updated List:");
        linkedList.display();

        // Validate using assertions
        Node<Integer> node = linkedList.search(30);
        assertNotNull(node, "Node with value 30 should exist.");
        assertNotNull(node.next, "Node after 30 should not be null.");
        assertEquals(40, node.next.data, "The value after 30 should be 40.");
    }
}

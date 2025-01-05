import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testDeleteAndSize() {
        // Step 1: Create and populate the LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(70);
        linkedList.add(40);
        linkedList.add(30);
        linkedList.add(56);

        // Step 2: Verify initial size and sequence
        System.out.println("Initial List:");
        linkedList.display();
        assertEquals(4, linkedList.size(), "Initial size should be 4.");

        // Step 3: Search for the node with value 40
        Node<Integer> node = linkedList.search(40);
        assertNotNull(node, "Node with value 40 should exist.");

        // Step 4: Delete the node with value 40
        linkedList.delete(40);

        // Step 5: Verify the final sequence and size
        System.out.println("Updated List:");
        linkedList.display();
        assertEquals(3, linkedList.size(), "Final size should be 3.");
        assertNull(linkedList.search(40), "Node with value 40 should no longer exist.");
    }
}

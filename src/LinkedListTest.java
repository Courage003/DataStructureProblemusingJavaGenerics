import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {

    @Test
    public void testSearch(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements 56, 30, and 70
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);

        // Search for the node with value 30
        Node<Integer> result = linkedList.search(30);

        // Assert that the node is not null and contains the correct value
        assertNotNull(result, "Node with value 30 should be found.");
        assertEquals(30, result.data, "The data of the found node should be 30.");

        // Test for a value that does not exist
        Node<Integer> notFoundResult = linkedList.search(99);
        assertNull(notFoundResult, "Node with value 99 should not be found.");
    }


}

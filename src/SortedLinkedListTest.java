import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedListTest {

    @Test
    void testSortedLinkedList() {
        // Step 1: Create an instance of SortedLinkedList
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();

        // Step 2: Add elements in random order
        sortedList.add(56);
        sortedList.add(30);
        sortedList.add(40);
        sortedList.add(70);

        // Step 3: Verify the sequence is sorted
        System.out.println("Sorted List:");
        sortedList.display();

        // Verify the sequence is in ascending order
        Node<Integer> current = sortedList.head;
        assertNotNull(current, "List should not be empty.");

        // Expected sorted sequence
        Integer[] expectedSequence = {30, 40, 56, 70};
        int index = 0;

        while (current != null) {
            assertEquals(expectedSequence[index], current.data, "Node data should match the expected sequence.");
            current = current.next;
            index++;
        }

        assertEquals(expectedSequence.length, index, "List size should match the number of elements added.");
    }
}

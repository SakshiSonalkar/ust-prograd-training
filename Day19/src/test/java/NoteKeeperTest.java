import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoteKeeperTest {
    NoteKeeper noteKeeper = new NoteKeeper();

    @BeforeEach
    public void AddItems(){
        noteKeeper.addList("Maths Class",true);
        noteKeeper.addList("Homework",false);
        noteKeeper.addList("Assignment",false);
        noteKeeper.addList("Project",true);

    }


    @Test
    public void AddItemsToTodoListTest() {
        noteKeeper.addList("Yoga Class",true);
        assertEquals("Yoga Class", noteKeeper.checkList("Yoga Class") );
    }

    @Test
    public void removeItemsFromTodoList() {

        boolean actualList = noteKeeper.removeList("Homework");
        assertEquals(true , actualList);
    }

    @Test
    public void throwsExceptionIfToDoListIsEmpty(){
        assertThrows(Exception.class,()->noteKeeper.removeAll());
    }

    @Test
    public void unRemoveFromTo_DoList() {

        boolean actualList = noteKeeper.unRemoveList("Homework");
        assertEquals(true , actualList);

    }

    @Nested
    public class toggleBetweenCompletedAndNotCompletedTodoListTest {

        @Test
        public void checkIfTaskIsCompleted() {
            boolean actualList = noteKeeper.completedOrNotCompleted("Project");
            assertEquals(false, actualList);
        }

        @Test
        public void checkIfTaskIsNotCompleted() {
            boolean actualList = noteKeeper.completedOrNotCompleted("Assignment");
            assertEquals(true, actualList);


        }
    }
}

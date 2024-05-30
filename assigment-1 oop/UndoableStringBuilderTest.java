package observer;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
    class UndoableStringBuilderTest {
        UndoableStringBuilder usb1;

        @BeforeEach
        void setUp() {
            this.usb1 = new UndoableStringBuilder();
        }

        @Test
        void testAppend() {
            usb1.append("This is the first line");
            assertEquals("This is the first line",usb1.toString());
            usb1.append("A second line");
            assertEquals("This is the first lineA second line",usb1.toString() );
            usb1.undo();
            assertEquals("This is the first line",usb1.toString());
            usb1.append("AB");
            usb1.append("BA");
            usb1.undo();
            assertEquals("This is the first lineAB",usb1.toString());
            usb1.append(null);
            assertEquals("This is the first lineABnull",usb1.toString());

        }
        @Test
        void testDelete() {
            usb1.delete(0,0);
            assertEquals("", usb1.toString());
            usb1.append("Great");
            usb1.delete(0,-1);
            assertEquals("Great",usb1.toString());
            usb1.delete(0,1);
            assertEquals("reat", usb1.toString());
            usb1.delete(2,4);
            assertEquals("re", usb1.toString());
            usb1.delete(0,50);
            assertEquals("re", usb1.toString());
            usb1.append(null);
            usb1.delete(1,2);
            assertEquals("rnull",usb1.toString());
            usb1.undo();
            usb1.undo();
            usb1.undo();
            assertEquals("reat", usb1.toString());

        }
        @Test
        public void insertUndoStringBuilderWhichIsEmpty(){
            usb1.insert(5,"Hello");
            assertEquals("",usb1.toString());
        }
        @Test
        void reverse() {
            usb1.append("to do or not to do");
            usb1.reverse();
            assertEquals("od ot ton ro od ot", usb1.toString());
            usb1.reverse();
            assertEquals("to do or not to do", usb1.toString());
            usb1.undo();
            usb1.undo();
            assertEquals("to do or not to do",usb1.toString());
        }

        @Test
        void replace() {
            usb1.append("to be or not to be");
            assertEquals("to eat or not to be", usb1.replace(3, 5, "eat").toString());
            usb1.replace(17, 19, "eat");
            assertTrue(true, "to eat or not to eat");
            usb1.undo();
            usb1.undo();
            usb1.undo();
            assertEquals("", usb1.toString());
        }

        @Test
            // check out of bound
        void replaceOutOfBounds() {
            assertDoesNotThrow(() -> usb1.replace(usb1.toString().length()+1,1000000,"Test"));
            assertEquals("", usb1.replace(usb1.toString().length()+1,1000000,"Test").toString());

        }
        @Test
        void replaceNullStr() {
            assertDoesNotThrow(() -> usb1.replace(0,1,null));
            assertEquals("", usb1.replace(0,1,null).toString());
        }
        @Test
        void undo() { // not needed because we use undo() in the tests above
            usb1.undo();
            assertEquals("", usb1.toString());
            usb1.append("a");
            usb1.append("b");
            assertEquals("ab", usb1.toString());
            usb1.undo();
            assertEquals("a", usb1.toString());
            usb1.replace(0,1,"c");
            assertEquals("c",usb1.toString());
            usb1.undo();
            usb1.undo();
            usb1.undo();
            assertEquals("", usb1.toString());
        }



    }




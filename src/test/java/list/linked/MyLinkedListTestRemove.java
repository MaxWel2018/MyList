package list.linked;

import list.array.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTestRemove {
    MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

    {
        myLinkedList.add("Str");
        myLinkedList.add("Str2");
        myLinkedList.add("Str3");
    }

    @Test
    public void shoudReturnTrueWhenRemoveElement() {
        assertTrue(myLinkedList.remove("Str2"));
    }

    @Test
    public void shoudReturnFalseRemoveElement() {
        assertFalse(myLinkedList.remove("str2"));
    }

}
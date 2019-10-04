package list.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTestRemove {
    MyArrayList<String> myArrayList = new MyArrayList<String>();

    {
        myArrayList.add("Str");
        myArrayList.add("Str2");
        myArrayList.add("Str3");
    }

    @Test
    public void shoudReturnTrueWhenRemoveElement() {
        assertTrue(myArrayList.remove("Str2"));
    }

    @Test
    public void shoudReturnFalseRemoveElement() {
        assertFalse(myArrayList.remove("str2"));
    }

}
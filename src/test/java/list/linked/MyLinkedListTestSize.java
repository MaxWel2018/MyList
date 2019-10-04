package list.linked;

import list.array.MyArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyLinkedListTestSize {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
    private int i;
    private int result;

    public MyLinkedListTestSize(int i, int result) {
        this.i = i;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection data() {
        Object[][] data = new Object[][]{
                {0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4},
                {10, 10}, {20, 20}, {30, 30}

        };
        return Arrays.asList(data);
    }

    @Test
    public void shuoldReturnSizeArray() {
        for (int j = 0; j < i; j++) {
            myLinkedList.add(2);
        }
        assertEquals(result, i);
    }


}
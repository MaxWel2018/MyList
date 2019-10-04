package list.linked;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyLinkedListTestGetById {
    MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
    private int i;
    private String result;

    public MyLinkedListTestGetById(int i, String result) {
        this.i = i;
        this.result = result;
    }

    {
        myLinkedList.add("Str");
        myLinkedList.add("Str2");
        myLinkedList.add("Str3");
        myLinkedList.add("Str4");
        myLinkedList.add("Str5");
        myLinkedList.add("Str6");
        myLinkedList.add("Str7");
    }
    @Parameterized.Parameters
    public static Collection data() {
        Object[][] data = new Object[][]{
                {0, "Str"}, {1, "Str2"}, {2, "Str3"}, {3, "Str4"}, {4, "Str5"},
                {5, "Str6"}, {6, "Str7"}

        };
        return Arrays.asList(data);
    }

    @Test
    public void shouldReturnElemetForId() {
        for (int j = 0; j <i ; j++) {
            assertEquals(result, myLinkedList.getByIndex(i));
        }
    }

}
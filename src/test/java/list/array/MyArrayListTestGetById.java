package list.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class MyArrayListTestGetById {
    MyArrayList<String> myArrayList = new MyArrayList<String>();
    private int i;
    private String result;

    public MyArrayListTestGetById (int i, String result) {
        this.i = i;
        this.result = result;
    }

    {
        myArrayList.add("Str");
        myArrayList.add("Str2");
        myArrayList.add("Str3");
        myArrayList.add("Str4");
        myArrayList.add("Str5");
        myArrayList.add("Str6");
        myArrayList.add("Str7");
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
            assertEquals(result,myArrayList.getByIndex(i));
        }
    }

}
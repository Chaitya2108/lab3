import static org.junit.Assert.*;

import java.beans.Transient;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class ListTests {

    @Test
    public void testFilter1() {
        String[] letters = new String[] { "a", "a", "a", "a", "b", "b" };
        List<String> letterList = new ArrayList<>();
        for (String letter : letters) {
            letterList.add(letter);
        }
        

    }

}

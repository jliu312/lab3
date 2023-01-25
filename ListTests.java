import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("abc");
        testList.add("abcdef");
        List<String> expected = new ArrayList<>();
        expected.add("abcdef");
        List<String> filteredList = ListExamples.filter(testList, new implementedStringChecker());
        assertEquals(filteredList.size(), expected.size());
        assertEquals(filteredList.get(0), expected.get(0));

        testList.add("abcdefg");
        filteredList = ListExamples.filter(testList, new implementedStringChecker());
        expected.add("abcdefg");
        assertEquals(filteredList.size(), expected.size());
        assertEquals(filteredList.get(0), expected.get(0));
        assertEquals(filteredList.get(1), expected.get(1));
    }

    @Test
    public void testMerge(){

    }
}

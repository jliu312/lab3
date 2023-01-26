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
        List<String> testList1 = new ArrayList<>();
        testList1.add("1"); 
        testList1.add("3"); 
        testList1.add("5");
        List<String> testList2 = new ArrayList<>();
        testList2.add("2");
        testList2.add("4");
        testList2.add("6");
        
        List<String> mergedList = ListExamples.merge(testList1, testList2);

        List<String> expectedList = new ArrayList<>();
        for(int i = 1; i <= 6; i++) expectedList.add("" + i);

        assertEquals(mergedList.size(), expectedList.size());
        for(int i = 0; i < mergedList.size(); i++) {
            assertEquals(mergedList.get(i), expectedList.get(i));
        }
    }
}

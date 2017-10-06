import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueCharsTest {

    UniqueChars testUniqueChars = new UniqueChars ();
    List<Integer> atestUniqueChars = new ArrayList<> ();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void notUniqueChars() throws Exception{
        assertTrue(testUniqueChars.uniqueChars ("n", "g"));
    }
}


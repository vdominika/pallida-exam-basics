import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args) {

        System.out.println (uniqueCharacters ("anagram"));

        public void uniqueCharacters (String);
        {
            List<Character> uniqueChars = new ArrayList<Character> ( );
            Set<Character> unique = new HashSet<Character> ( );
            for (char c : "anagram".toCharArray ( )) {
                uniqueChars.add (c);
                unique.add (c);
            }
            // Create a function called `uniqueCharacters` that takes a string as parameter
            // and returns a list with the unique letters of the given string
            // Create basic unit tests for it with at least 3 different test cases
            System.out.println (uniqueCharacters ("anagram"));
            // Should print out:
            // ["n", "g", "r", "m"]
        }
    }
}
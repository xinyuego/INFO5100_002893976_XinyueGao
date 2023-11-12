import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        String[] regexPatterns = {
                "\\d+",              // digits
                "[a-zA-Z]+",         // letters
                "[^a-zA-Z0-9]",      // special characters
                "\\bword\\b",        // word boundary
                "^The",              // starts with 'The'
                "end\\.$"            // ends with 'end.'
        };

        // Test strings for positive cases
        String[] positiveTestStrings = {
                "1234",              // digits
                "Hello",             // letters
                "@",                 // special character
                "a word in text",    // word boundary
                "The beginning",     // starts with 'The'
                "This is the end."   // ends with 'end.'
        };

        // Test strings for negative cases
        String[] negativeTestStrings = {
                "abc",               // not only digits
                "1234",              // not only letters
                "abc123",            // no special character
                "wordless",          // no standalone word 'word'
                "At the beginning",  // doesn't start with 'The'
                "This is the end"    // doesn't end with 'end.'
        };

        for (int i = 0; i < regexPatterns.length; i++) {
            System.out.println("Testing pattern: " + regexPatterns[i]);
            Pattern pattern = Pattern.compile(regexPatterns[i]);

            Matcher positiveMatcher = pattern.matcher(positiveTestStrings[i]);
            System.out.println("Positive case: " + positiveTestStrings[i] + " - Match found: " + positiveMatcher.find());

            Matcher negativeMatcher = pattern.matcher(negativeTestStrings[i]);
            System.out.println("Negative case: " + negativeTestStrings[i] + " - Match found: " + negativeMatcher.find());

            System.out.println();
        }

    }
}
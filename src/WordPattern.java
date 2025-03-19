import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

//Resources used:
//https://youtu.be/J5dw2o4PNxE?si=WV16aBXB-mrWRyuT
//https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html


public class WordPattern {
    public static boolean isWordPattern(String pattern, char delimiter, String s) {
        String[] words = s.split(Pattern.quote(String.valueOf(delimiter)));

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];

            if (patternToWord.containsKey(p) && !patternToWord.get(p).equals(w)) {
                return false;
            }

            if (wordToPattern.containsKey(w) && wordToPattern.get(w) != p) {
                return false;
            }

            patternToWord.put(p, w);
            wordToPattern.put(w, p);
        }

        return true;
    }

//    public static void main(String[] args) {
//        System.out.println(isWordPattern("abba", '?', "dog?cat?cat?dog"));
//        System.out.println(isWordPattern("abba", '|', "apple|banana|grape|apple"));
//        System.out.println(isWordPattern("aaaa", ' ', "ice cream taco day"));
//        System.out.println(isWordPattern("adxp", ' ', "ice cream taco day"));
//    }
}

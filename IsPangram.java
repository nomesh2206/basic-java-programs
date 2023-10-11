import java.util.HashSet;
import java.util.Set;

public class IsPangram {
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence1 = "mynameispratik";
        boolean pangram = checkIfPangram(sentence1);
        if(pangram == true)
            System.out.println("is pangram");
        else
            System.out.println("not a pangram");
    }
}


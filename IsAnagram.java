import java.util.HashMap;

public class IsAnagram {
    public static boolean anagramCheck(String s, String t){
        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer> test = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(test.containsKey(s.charAt(i)))
                test.put(s.charAt(i), test.get(s.charAt(i)) + 1);

            else
                test.put(s.charAt(i), 1);
        }

        for(int i=0; i<t.length(); i++){
            if(test.containsKey(t.charAt(i))){
                test.put(t.charAt(i), test.get(t.charAt(i)) - 1);

                if(test.get(t.charAt(i)) == 0)
                test.remove(t.charAt(i));
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "analaam";
        boolean x = anagramCheck(s,t);
        if(x==true)
            System.out.println("is anagram");
        else
            System.out.println("not an anagram");
    }
}

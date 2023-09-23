public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int ptr1 = 0;
        int ptr2 = 0;

        while(ptr1<s.length() && ptr2<t.length()){
            if(s.charAt(ptr1) == t.charAt(ptr2))
            {ptr1++;}
            ptr2++;
        }
        return ptr1 == s.length();
    }

    public static void main(String[] args) {
        String s = "omne";
        String t = "nomesh";
        boolean x = isSubsequence(s, t);
        if(x)
            System.out.println("Valid SubSequence");
        else
            System.out.println("Not a SubSequence");
    }
}

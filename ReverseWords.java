import java.util.Stack;

public class ReverseWords {
    public static String reverseWords(String s){
        Stack<String> st = new Stack<>();
        String temp = "";
        String ans = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(temp.length() > 0)
                    st.push(temp);
                temp = "";
            }
            else
                temp = temp + s.charAt(i);
        }

        ans = ans + temp;  //for_last_word

        while(!st.isEmpty()){
            ans = ans +" " + st.pop();
        }

        if(ans.length() != 0 && ans.charAt(0) == ' ')
            ans = ans.substring(1);

        return ans;
    }

    public static void main(String[] args) {
        String s = "my name is pratik";
        String rev = reverseWords(s);
        System.out.println(rev);
    }
}


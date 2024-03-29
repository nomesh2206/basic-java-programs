import java.util.HashMap;
import java.util.Scanner;

public class CountViaHashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        str = str.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                count++;
                map.replace(ch, count);
            }
            else {
                map.put(ch, 1);
            }
        }
        char k = 0;
        int max = 0;
        for(Character key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                k = key;
            }
            System.out.println(key +" " + map.get(key));
        }
        System.out.println("maximum frequency is of character " + k + " = " + map.get(k));

    }
}

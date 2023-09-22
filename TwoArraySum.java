import java.util.*;

public class TwoArraySum {
    public static void findPairs(int arr1[], int arr2[], int x) {
        // Insert all elements of first array in a hash
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> s1 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++)
            s.put(arr1[i], 0);

        // Subtract sum from second array elements one
        // by one and check it's present in array first
        // or not
        for (int j = 0; j < arr2.length; j++) {
            if (s.containsKey(x - arr2[j])) {
                //System.out.println(x - arr2[j] + " " + arr2[j]);
                s1.put(x - arr2[j], arr2[j]);
            }
        }
        for (Map.Entry m : s1.entrySet()) System.out.println(m.getKey() + ":" + m.getValue());
    }
    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr1[] = {1, 0, -4, 7, 6, 4};
        int arr2[] = {0, 2, 4, -3, 2, 1};
        int x = 8;
        findPairs(arr1, arr2,x);
    }
}
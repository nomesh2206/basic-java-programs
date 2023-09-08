public class AllZeroesAtStart {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 7, 45, 7, 2, 8, 7, 1, 5, 25, 7, 8};
        int x = arr.length;
        System.out.println(x);
        int count = 0;
        int updated[] = new int[x];

        for (int i = 0; i < x; i++) {
            if (arr[i] == 7) {
                updated[count] = 7;
                count++;
            }
        }

        for (int j = 0; j < x; j++) {
            if (arr[j] != 7) {
                updated[count] = arr[j];
                count++;
            }
        }

        System.out.print("previous array");
        for(int i=0;i<x;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nUpdated array");
        for(int i=0;i<x;i++) {
            System.out.print(updated[i] + " ");
        }
    }
}

public class Main {
  // function to calculate the maximum number in the subarray
  private static void maxOfSubarray(int[] arr, int k) {
    int max = Integer.MIN_VALUE;

   // traverse from an index till the next k numbers
    for(int i = 0 ; i <= arr.length - k ; i++) {
      max = arr[i];
      for(int j = i + 1 ; j <= i + k - 1; j++) {
       // find the maximum number
        max = Math.max(max, arr[j]);
      }
      System.out.print(max+" ");
    }
  }

  // driver Code
  public static void main(String[] args) {
    int[] arr = new int[] {11 ,3 ,9 ,6};
    int k = 3;
    maxOfSubarray(arr, k);
  }
}

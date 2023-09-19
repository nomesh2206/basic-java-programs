public class SecondLargestinArray {
    static int secondLargest(int arr[]){
        int seclargest = 0;
        int secInd = 0;
        int largest = arr[largest(arr)];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < largest){
                if(arr[i]>seclargest) {
                    seclargest = arr[i];
                    secInd = i;
                }
            }
        }
        System.out.println("second largest element : " + seclargest);
        return secInd;
    }

    public static int largest(int arr[]){
        int largest = arr[0];
        int largeInd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) {
                largest = arr[i];
                largeInd = i;
            }
        }
        System.out.println("largest element is : " + largest);
        return largeInd;
    }

    public static void main(String[] args) {
        int arr[] = { 55 , 55 , 55 };
        int index = secondLargest(arr);
        if (index == 0)
            System.out.println("All elements are equal");
        else
            System.out.println("index of second largest element is : " + (index+1));
    }
}

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int num1[] = new int[nums.length];
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                num1[count] = nums[i];
                count++;
            }
        }
        num1[count++] = nums[nums.length-1];

        for(int x=0;x<num1.length;x++){
            nums[x] = num1[x];
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,1,1,2,2,3,3,3,4,4};
        int k = removeDuplicates(nums);

        for (int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}

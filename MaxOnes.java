public class MaxOnes {
    public static int findMaxConsecutiveOnes(int[] nums)
    {
        int maximum=0;
        int i=0;
        while(i<nums.length)
        {
            int countOnes=0;
            while(i< nums.length && nums[i]==1)
            {
                countOnes++;
                i++;
            }
            maximum = (maximum > countOnes) ? maximum : countOnes;
            i++;
        }
        return maximum;
    }

    public static void main(String args[])
    {
        int nums[]={1,1,0,1,1,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}

public class MaxOnes {
    public static int findMaxConsecutiveOnes(int[] nums)
    {
        int maximum=0;
        int i=0;
        while(i<nums.length)
        {
            int conOnes=0;
            while(i< nums.length && nums[i]==1)
            {
                conOnes++;
                i++;
            }
            maximum=Math.max(maximum,conOnes);
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

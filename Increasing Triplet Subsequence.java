class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int sndSmallest = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] <= smallest){
                smallest = nums[i];
            }
            else if(nums[i] <= sndSmallest){
                sndSmallest = nums[i];
            }
            else if(nums[i] > sndSmallest){
                return true;
            }
        }
        return false;
    }

}

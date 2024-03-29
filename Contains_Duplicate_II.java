boolean containsNearbyDuplicates(int nums[], int k){
  Map<Integer, Integer> map = new HashMap<>();

  for(int i;i<nums.length;i++){
    if(map.containsKey(nums[i]) && (i-map.get(nums[i]) <= k){
      return true;
    }

    map.put(nums[i], i);
  }
return false;
}

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else hm.put(arr[i],1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int key: hm.keySet()){
            if(set.contains(hm.get(key))) return false;
            else set.add(hm.get(key)); 
        }
      return true;
    }
}

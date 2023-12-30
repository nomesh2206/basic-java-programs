class Solution {
    public int totalFruit(int[] tree) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int firstindx = 0;
        int totalMax = 0;

        for (int i = 0; i < tree.length; i++) {
            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);
            while (map.size() > 2) {
                map.put(tree[firstindx], map.get(tree[firstindx]) - 1);
                if (map.get(tree[firstindx]) == 0) {
                    map.remove(tree[firstindx]);
                }
                firstindx++;
            }
            totalMax = Math.max(totalMax, i - firstind + 1);
        }
        return totalMax;
    }

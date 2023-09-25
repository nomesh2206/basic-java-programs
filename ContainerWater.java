public class ContainerWater {
    public static int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int max = 0;

        while(lp < rp){
            int left = height[lp];
            int right = height[rp];
            int minHeight = (left<right) ? left : right;
            int dist = rp - lp;
            int area = minHeight * dist;
            //System.out.println(left + ":" + right + " = " + area);
            max = (max>area) ? max : area;
            if(left<right)
                lp++;
            else
                rp--;
        }
        return max;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        //int height[] = {1,5,4,3};
        int maxWater = maxArea(height);
        System.out.println("Container that contains maximum water " + maxWater);
    }
}

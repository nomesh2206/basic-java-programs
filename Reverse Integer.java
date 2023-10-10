class Solution {
    public int reverse(int x) {
        int no = x;
        int rem, rev = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(no != 0){
            rem = no % 10;
            
            if(rev > max/10 || (rev == max/10 && rem > 7))
                return 0; //positive
            if(rev < min/10 || (rev == min/10 && rem < -8))
                return 0;//negative

            rev = rev*10 + rem;
            no = no/10;
        }
        return rev;
    }
}

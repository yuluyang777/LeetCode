package LeetCode_007;

class Solution {
    public int reverse(int x) {
        int r= 0;
        if(x>=Integer.MAX_VALUE||x<=Integer.MIN_VALUE){
            return 0;
        }
        while(x!=0){
            r=10*r+x%10;
            x=x/10;
            if(r>Integer.MAX_VALUE/10&&x>0||r==Integer.MAX_VALUE/10&&x>7||r<Integer.MIN_VALUE/10&&x<0||r==Integer.MIN_VALUE/10&&x<-8){
                return 0;
            }
        }
        return r;
    }
}


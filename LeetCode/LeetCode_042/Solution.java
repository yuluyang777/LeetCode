package LeetCode_042;

public class Solution {
    public static int trap(int[] height){

        int size = height.length;
        int MaxWater = 0;

        for (int i = 0; i <size-2; i++) {
            for (int j = i; j < size-1; j++) {


            }

        }
        return MaxWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int s = trap(arr);
        System.out.println(s);
    }
}

package LeetCode_011;

class Solution {
    public static int maxArea(int[] height) {

        int size = height.length;
        int MaxS = 0;

        for (int i = 0; i < size-1; i++) {
            for (int j = i; j < size; j++) {

                int s = (j-i) * Math.min(height[i], height[j]);
                MaxS = Math.max(MaxS, s);
            }
        }

        return MaxS;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int s = maxArea(arr);
        System.out.println(s);
    }
}

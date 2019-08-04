package LeetCode_026;

import java.util.Arrays;

public class Method_1 {

    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        int[] arr = new int[len];

        int cur = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[cur]) {
                nums[++cur] = nums[i];
            }
        }

        return cur + 1;
    }
}

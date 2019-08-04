package LeetCode_001;

import java.util.HashMap;
import java.util.Map;

public class Method_2 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int ans = target - nums[i];
            if (map.containsKey(ans)){
                return new int[] {map.get(ans), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

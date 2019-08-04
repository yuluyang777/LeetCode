package LeetCode_088;

public class Method_1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m + n - 1;
        m = m - 1;
        n = n - 1;

        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }

    }
}

// Last updated: 14/07/2026, 14:16:53
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }

        return res;
        
    }
}
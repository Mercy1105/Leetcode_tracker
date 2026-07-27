// Last updated: 27/07/2026, 11:17:47
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int count = 0;
4        for (int i = 0; i < nums.length - 1; i++) {
5            if (nums[i] > nums[i + 1]) {
6                count++;
7                if (count > 1) {
8                    return false;
9                }
10                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
11                    nums[i] = nums[i + 1];
12                }
13                else {
14                    nums[i + 1] = nums[i];
15                }
16            }
17        }
18        return true;
19    }
20}
// Last updated: 14/07/2026, 14:16:22
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            k--;
            if(k==0) return nums[i];
        }
        return 0;
    }
}
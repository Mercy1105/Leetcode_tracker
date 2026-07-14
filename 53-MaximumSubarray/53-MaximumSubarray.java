// Last updated: 14/07/2026, 14:17:08
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int subMax=0;
        for(int num:nums){
            subMax+=num;
            max=Math.max(max,subMax);
            if(subMax<0)subMax=0;
        }
        return max;
    }
}
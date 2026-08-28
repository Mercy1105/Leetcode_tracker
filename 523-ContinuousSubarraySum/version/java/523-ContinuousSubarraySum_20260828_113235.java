// Last updated: 28/08/2026, 11:32:35
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5        int sum = 0;
6        for(int i = 0; i < nums.length; i++) {
7            sum += nums[i];
8            int rem = sum % k;
9            Integer pre = map.get(rem);
10            if(pre != null){ 
11                if(i - pre >= 2){
12                return true;
13                }
14            }else{
15                map.put(rem, i);
16            }
17        }
18    return false;
19    }
20}
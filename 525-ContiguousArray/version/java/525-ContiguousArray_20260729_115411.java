// Last updated: 29/07/2026, 11:54:11
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5        int sum = 0;
6        int maxLength = 0;
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] == 0)
9                sum -= 1;
10            else
11                sum += 1;
12            if (map.containsKey(sum)) {
13                int length = i - map.get(sum);
14                maxLength = Math.max(maxLength, length);
15            } else {
16                // Store first occurrence only
17                map.put(sum, i);
18            }
19        }
20        return maxLength;
21    }
22}
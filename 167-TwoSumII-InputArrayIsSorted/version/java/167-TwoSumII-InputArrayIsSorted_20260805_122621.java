// Last updated: 05/08/2026, 12:26:21
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length - 1;
5        while (left < right) {
6            int total = numbers[left] + numbers[right];
7            if (total == target) {
8                return new int[]{left + 1, right + 1};
9            } else if (total > target) {
10                right--;
11            } else {
12                left++;
13            }
14        }
15        return new int[]{-1, -1};
16    }
17}
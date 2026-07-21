// Last updated: 21/07/2026, 14:07:33
1class Solution {
2    public int minMoves(int[] nums) {
3        int mn = Integer.MAX_VALUE;
4        for (int num : nums) {
5            mn = Math.min(mn, num);
6        }
7        int moves = 0;
8        for (int num : nums) {
9            moves += num - mn;
10        }
11        return moves;
12    }
13}
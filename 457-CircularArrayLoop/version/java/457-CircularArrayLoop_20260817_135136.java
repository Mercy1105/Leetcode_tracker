// Last updated: 17/08/2026, 13:51:36
1class Solution {
2    public boolean circularArrayLoop(int[] nums) {
3        int len = nums.length;
4        boolean[] visited = new boolean[len];
5        for(int i = 0; i < len; i++){
6            if(!visited[i]){
7                if(nums[i] > 0){
8                    pos = true;
9                    if(passing(visited, i, nums, len, true, new boolean[len]) && pos) return true;
10                }
11                else{
12                    pos = false;
13                    if(passing(visited, i, nums, len, true, new boolean[len]) && !pos) return true;
14                }
15            }
16        }
17        return false;
18    }
19    boolean pos;
20    public boolean passing(boolean[] visited, int ind, int[] nums, int len, boolean flg, boolean[] visit){
21        if(visit[ind]) return true;
22        visited[ind] = true;
23        visit[ind] = true;
24        int limit = ind+nums[ind];
25        limit %= len;
26        if(flg && pos && nums[ind] < 0){
27            pos = false;
28            flg = false;
29        }
30        else if(flg && !pos && nums[ind] > 0){
31            pos = true;
32            flg = false;
33        }
34        if(limit >= len) limit %= len;
35        if(limit < 0) limit = len+limit;
36        if(limit == ind || !flg) return false;
37        return passing(visited, limit, nums, len, flg, visit);
38    }
39}
// Last updated: 01/09/2026, 13:49:27
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int prefix=0; 
4        int count=0; 
5        HashMap <Integer,Integer> map=new HashMap<>();
6        map.put(0,1); 
7        for(int i=1;i<=nums.length;i++){ 
8            prefix+=nums[i-1]; 
9            int reqPre=prefix-k; 
10            if(map.containsKey(reqPre)){
11                count+=map.get(reqPre);
12            }
13            map.put(prefix,map.getOrDefault(prefix,0)+1);
14        }
15        return count;
16    }
17}
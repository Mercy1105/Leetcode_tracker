// Last updated: 01/09/2026, 13:47:33
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3        HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
4        for(int []a:logs){
5            int u=a[0];
6            int v=a[1];
7            if(!map.containsKey(u)){
8                map.put(u,new HashSet<>());
9                map.get(u).add(v);
10            }
11            else{
12                map.get(u).add(v);
13            }
14        }
15        int[]ans=new int[k];
16        for(int a:map.keySet()){
17            HashSet<Integer> b=map.get(a);
18              ans[b.size()-1]++;
19        }
20        return ans;
21    }
22}
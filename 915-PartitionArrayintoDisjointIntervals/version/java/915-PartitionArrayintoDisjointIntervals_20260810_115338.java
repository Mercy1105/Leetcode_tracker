// Last updated: 10/08/2026, 11:53:38
1class Solution {
2    public int partitionDisjoint(int[] A) {
3        int[] lmax=new int[A.length]; 
4        int[] rmin=new int[A.length]; 
5        int max=Integer.MIN_VALUE;
6        for(int i=0;i<A.length;i++){
7            max=Math.max(max,A[i]);
8            lmax[i]=max;
9        }
10        int min=Integer.MAX_VALUE;
11        for(int i=A.length-1;i>=0;i--){
12            min=Math.min(min,A[i]);
13            rmin[i]=min;
14        }
15        for(int i=1;i<A.length;i++){
16            if(lmax[i-1]<=rmin[i]) return i;
17        }
18        return A.length;
19    }
20}
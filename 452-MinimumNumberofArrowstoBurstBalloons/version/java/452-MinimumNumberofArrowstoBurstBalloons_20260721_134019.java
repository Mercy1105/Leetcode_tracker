// Last updated: 21/07/2026, 13:40:19
1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        if (points == null || points.length == 0) return 0;
4        Arrays.sort(points, (int[] p1, int[] p2)->{
5		    // Don't use p1[1 ] - p2[1]. It may overflow 
6            return p1[1] < p2[1] ? -1 : 1; 
7        });
8        int end = points[0][1];
9		
10		// the reason res = 1 is that we need an arrow to destroy the last group. 
11        int res = 1;
12        for (int[] point: points)
13        {
14            if (point[0] <= end) continue;
15            res++;
16            end = point[1];
17        }
18        return res;
19    
20    }
21}
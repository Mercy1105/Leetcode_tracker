// Last updated: 28/08/2026, 11:55:01
1class Solution {
2    public int maxPoints(int[][] points) {
3        int n = points.length;
4        if(n <= 2) return n;
5        int ans = 2;
6        for(int i = 0 ;i < n; i++){
7            for(int j = i+1; j < n ; j++){
8                int temp = 2;
9                for(int k = j+1 ; k<n ; k++ ){   
10                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
11                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
12                    if(x == y){
13                        temp++;
14                    }
15                }
16                if(temp > ans){
17                    ans = temp;
18                }
19            }
20        }   
21        return ans;
22    }
23}
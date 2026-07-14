// Last updated: 14/07/2026, 14:18:16
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,m=0;
        while(i<j){
            m=Math.max(m,(height[i]<height[j]?height[i]*(j-i++):height[j]*(j-- -i)));
        }
            return m;
    
    }
}
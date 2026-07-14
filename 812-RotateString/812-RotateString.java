// Last updated: 14/07/2026, 14:15:19
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return(s+s).contains(goal);
    }
}
// Last updated: 14/07/2026, 14:15:44
class Solution {
    public int countSegments(String str) {
        if(str==null || str.trim().isEmpty()){
            return 0;
        }
        else{
            String[] words = str.trim().split("\\s+");
            return words.length;
        }
    }
}
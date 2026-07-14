// Last updated: 14/07/2026, 14:18:13
class Solution {
    public boolean isValid(String s) {
        char arr[]=new char[s.length()];
        int ind=-1;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                arr[++ind]=')';
            }
            else if(ch=='{'){
                arr[++ind]='}';
            }
            else if(ch=='['){
                arr[++ind]=']';
            }
            else if(ind==-1){
                return false;
            }
            else if(arr[ind--]!=ch){
                return false;
            }
        }
        return ind==-1;
    }
}
// Last updated: 14/07/2026, 14:16:14
class Solution {
    public int addDigits(int num) {
        if(num == 0 ){
            return 0;
        }
        if(num % 9 == 0 ){
            return 9;
        }
        else{
            return num % 9;
        }
        
    }
}
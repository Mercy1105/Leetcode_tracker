// Last updated: 14/07/2026, 14:17:04
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]>9){
                digits[i]=0;
            }
            else{
                return digits;
            }
        }
        digits=new int [digits.length+1];
        digits[0]=1;
        return digits;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
       return helper(digits, digits.length -1);
    }
    private int[] helper(int[] digits,int indexLen){
        if(indexLen<0){
            int[] bigger = new int[digits.length+1];
            bigger[0] =1;
            return bigger;
        }
        else if(digits[indexLen] != 9){
            digits[indexLen] ++;
            return digits;
        }   
        digits[indexLen] = 0; 
        return helper(digits,indexLen-1);
    }
}
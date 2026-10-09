class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if (temp < 0){ return false; }
        int reverse = 0;
        while (temp !=  0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }    

        if (x == reverse){
            return true;
        } else {
            return false;
        }
    }
}
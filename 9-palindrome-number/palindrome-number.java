class Solution {
    public boolean isPalindrome(int x) {
        
        int num = x;
        int palindromeNum = 0;

        while(num>0){

            int digit = num%10;

            palindromeNum = palindromeNum*10 + digit;

            num = num/10;
        }

        if(palindromeNum==x){
            return true;
        }

        return false;

    }
}
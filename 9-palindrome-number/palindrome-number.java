class Solution {
    public boolean isPalindrome(int x) {

        int num = x;

        int ans = 0;

        while (num > 0) {

            int lastDigit = num % 10;

            ans = ans * 10 + lastDigit;

            num = num / 10;

        }

        if (ans == x) {
            return true;
        }

        else {
            return false;
        }

    }
}
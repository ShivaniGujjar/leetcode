class Solution {
    public boolean checkPerfectNumber(int num) {

        int x = num;
        int sum = 0;

        for (int i = 1; i < x; i++) {

            if (x % i == 0) {
                sum += i;
            }

        }

        if (sum == num) {
            return true;
        }

        else {
            return false;
        }

    }
}
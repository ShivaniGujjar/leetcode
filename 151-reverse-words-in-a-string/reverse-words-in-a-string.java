class Solution {
    public String reverseWords(String s) {

        String [] word = s.trim().split("\\s+");

        String reversed = "";

        for (int i = word.length - 1; i >= 0; i--) {

            reversed = reversed + word[i] + " ";
        }

        return reversed.trim();

    }
}
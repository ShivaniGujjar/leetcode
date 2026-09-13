class Solution {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            if (vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            else if (vowels.indexOf(chars[end]) == -1) {
                end--;
            }

            else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);

    }
}
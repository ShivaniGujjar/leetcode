class Solution {
    public boolean isPalindrome(String s) {

        
        int start = 0;
        int end = s.length()-1;
        Boolean isPalindrome = true;

        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            else{
                if(Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))){
                    start++;
                    end--;
                }

                else{
                    return isPalindrome = false;
                }
            }

            
        }

        if(isPalindrome==true){
            return true;
        }

        else{
            return false;
        }
        
    }
}
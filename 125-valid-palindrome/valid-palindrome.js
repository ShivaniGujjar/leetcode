/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    
    let cleaned  = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    let isPalindrome = true;

    let start = 0;
    let end = cleaned.length-1;

    while(start<end){
        if(cleaned[start]==cleaned[end]){
            start++;
            end--;

        }

        else{
            return isPalindrome = false;

        }

        
    }

   if(isPalindrome==true){
    return true;
   }

   else{
    return false;
   }

    
};
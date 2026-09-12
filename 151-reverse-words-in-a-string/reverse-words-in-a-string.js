/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {

    let word = s.trim().split(/\s+/);

    let reversed = "";

    

    for(let i=word.length-1; i>=0; i--){

        reversed = reversed + word[i] + " ";

        
    }

    
    return reversed.trim();
    
};
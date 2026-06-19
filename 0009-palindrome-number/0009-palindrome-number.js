/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) return false;
    var n=x;
    var rev=0;
    while(n!==0){
       let d=n%10;
       rev=rev*10+d;
       n=Math.floor(n/10);
    }
   
    return rev===x;
};
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(rev==y){
            return true;
        }
       
        return false;
        
    }
}
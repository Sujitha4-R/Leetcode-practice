class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==-1&&dividend==-2147483648){
            int b=2147483647;
            return b;
        }
        else{
       int c=  dividend/ divisor;
       return c;
    }
    
}
}
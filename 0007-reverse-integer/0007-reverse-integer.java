class Solution {
    public int reverse(int x) {
        int rem=0;
        long temp=0;
        while(x!=0){
            rem=x%10;
            temp=temp*10+rem;
            x=x/10;
        }
        if(temp<Integer.MIN_VALUE || temp>Integer.MAX_VALUE )
            return 0;
        else 
            return (int)temp;
        
    }
}
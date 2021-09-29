class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        int sum =0;
        int rem =0;
        if(n<9){
            return n;
            
        }
        else{
            sum = n%10+ digitalRoot(n/10);
        }
        if(sum>9){
            n = sum;
            return digitalRoot(n);
        }
        return sum;
    }
}

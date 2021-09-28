public class HelloWorld{
    
//Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.
//The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.
    static int josephus(int n,int k){
        if(n==0){
            return 0;
        }
        else{
            //When kth person is killed, n-1 person are left, we run a recursion for n-1 people for kth position, but Position have to start from k+1,which is now at k-1th postion
             // we take module of n for the position which exceeds n, adding 1 to it gives our result.
            return (josephus(n-1,k)+k-1)%n+1;
        }
    }

     public static void main(String []args){
        System.out.println(josephus(5,3));
        
     }
}

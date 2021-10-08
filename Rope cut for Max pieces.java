import java.util.Math;
public class HelloWorld{
    
    
    static int maxPiece(int l,int a,int b,int c){
        if(l==0){
            return 0;
        }
        if(l<0){
            return -1;
        }
        int res = Math.max(Math.max(maxPiece(l-a,a,b,c),maxPiece(l-b,a,b,c)),maxPiece(l-c,a,b,c));
        if(res==-1){
            return -1;
        }
        return res+1;
    }

     public static void main(String []args){
        //System.out.println("Hello World");
        System.out.println(maxPiece(23,11,9,12));
        
     }
}

import java.util.*;
public class HelloWorld{
    
    static ArrayList<Integer> intersection(int[]arr1,int[]arr2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n =arr1.length;
        int i = 0 ;
        int j = 0;
        int m = arr2.length;
        while(i<n && j<m){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

     public static void main(String []args){
        System.out.println("Hello World");
        int []arr1 = {10,20,20,40,60};
        int[]arr2 = {2,20,20,20,40};
        System.out.println(intersection(arr1,arr2));
     }
}

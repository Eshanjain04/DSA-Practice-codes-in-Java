 static void freq(int[]arr){
        int n=arr.length;
        int res=1;
        int count=1;
        int i = 1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                count++;
                i++;
            }
            System.out.println(arr[i-1]+" "+count);
            i++;
            count = 1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }
        
    }

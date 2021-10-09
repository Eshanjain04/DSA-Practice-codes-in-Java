static void moveZero(int[]arr){
        int n= arr.length;
        int arr2[] = new int[n];
        Arrays.fill(arr2,0);
        int res =1;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr2[res-1] = arr[i];
                res++;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }

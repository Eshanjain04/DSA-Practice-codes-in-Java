static void reverseArr(int[]arr){
        int n = arr.length;
        int low=0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }

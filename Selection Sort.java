static void selectionsorteff(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_ind = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            swap(arr[min_index],arr[i]);
        }
    }
    
    
    static void selectionSort(int[]arr){
        int n = arr.length;
        int []temp = new int[n];
        for(int i=0;i<n;i++){
            int min_ind = 0;
            for(int j=0;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind = j;
                }
            }
            temp[i] = arr[min_ind];
            arr[min_ind] = Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }

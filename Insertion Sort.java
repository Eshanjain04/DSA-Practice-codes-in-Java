 static void insertionSort(int[]arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];   //We store the ith element which we'll use later for insertion at right index
            int j = i-1;        // we will start with element i-1 to left(left sorted array)
            while(j>=0 && arr[j]>key){   //Till element is greater than ith element
                arr[j+1] = arr[j];         //and we move all elements one index forward till element is greter than key
                j--;
            }
            arr[j+1] = key;      //We replace the right index with key.
        }
    }

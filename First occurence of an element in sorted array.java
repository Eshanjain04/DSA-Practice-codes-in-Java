//Returns the first occurence of asked element in LogN Time
    static int firstOcc(int[]arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid -1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            
            else if(arr[mid-1]!=arr[mid] || mid = 0){
                return mid;
            }
            else{
                high = mid -1;
            }
        }
      return -1;
    }

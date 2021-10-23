//it counts number of occurrence of an element in an sorted array in LogN time 
// bascially, it finds first occurence and last occurence of element using binary.

static int firstOcc(int []arr,int x){
        int n = arr.length;
        int high = n-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else if(mid ==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    
    static int lastOcc(int []arr, int x){
        int n= arr.length;
        int high = n-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else if(arr[mid]==n-1 || arr[mid+1]!=arr[mid]){
                return mid;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    
    static int noOfOcc(int []arr, int x){
        int first = firstOcc(arr,x);
        if(first==-1){
            return 0;
        }
        else{
            return (lastOcc(arr,x) - first +1);
        }
    }

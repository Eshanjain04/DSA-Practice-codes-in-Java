//Only for the boundary case that only one element in array has to odd occuring
  static int oddOccur(int[]arr){
    int n= arr.length;
    int xor =0;
    for(int i=0;i<n;i++){
      xor = xor^arr[i];
    }
    return xor;
  }
  
    

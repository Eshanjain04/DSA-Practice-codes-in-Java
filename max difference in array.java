static int maxDiff2(int []arr){
        int n = arr.length;
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for(int j =1;j<n;j++){
            res = Math.max(res,arr[j]-minVal);
            minVal = Math.min(arr[j],minVal);
        }
        ret

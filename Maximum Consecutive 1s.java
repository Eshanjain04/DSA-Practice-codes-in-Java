static int maxOnes(int []arr){
        int n = arr.length;
        int res = 0;
        int curr_max = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                curr_max++;   //Incrementing current max with every 1 and if next element is 0 we set the current max as 0
                res = Math.max(res,curr_max);
                
            }
            else{
                curr_max =0;
            }
            
        }
        return res;
        
    }

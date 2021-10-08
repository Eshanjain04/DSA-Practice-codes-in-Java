static int secondMax(int[]arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int [] arr2 = new int[n];
        for(int j=0;j<n;j++){
            if(arr[j]!=max){
                arr2[j]=arr[j];
            }
        }
        int max2 = Integer.MIN_VALUE;
        for(int k=0;k<arr2.length;k++){
            System.out.print(arr2[k]+" ");
        }
        for(int i=0;i<n;i++){
            if(arr2[i]>max2){
                max2 = arr2[i];
            }
        }
        
        return max2;

    }

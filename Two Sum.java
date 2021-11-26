//In this Approach, we initiate empty hashamp and add (Key,Value) pair of (Number,Index)
//We find if (Target-arr[i]) Key is present in Hashmap 
//if present, then we return index i and Value figure of (target-arr[i]) by map.get(target-arr[i])
//if not present, we add key,value pair of arr[i],i

static int[] twoSumHash(int[]arr,int trgt){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();   
        int [] res = new int[2];
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(trgt-arr[i])){
                res[0] = i;
                res[1] = hm.get(trgt-arr[i]);
                return result;
            }
            else{
                hm.put(arr[i],i);
            }
        }
        return result;
    }

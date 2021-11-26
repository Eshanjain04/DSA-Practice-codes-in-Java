//In this Approach, we initiate empty hashamp and add (Key,Value) pair of (Number,Index)
//We find if (Target-arr[i]) Key is present in Hashmap 
//if present, then we return index i and Value figure of (target-arr[i]) by map.get(target-arr[i])
//if not present, we add key,value pair of arr[i],i

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = hm.get(target-nums[i]);
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}

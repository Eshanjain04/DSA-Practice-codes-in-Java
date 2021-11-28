//Given an array with integer in range[1 to n], we have to find missing element from this range
//Basically we use the element to go the index -> arr[element] -1;
//then we convert this element to negative
//After first iteration, certain element won't be converted to negative that missing index +1 is the answer

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]);
                if(nums[idx-1]>0){
                    nums[idx-1]*= -1; 
                }
            
            }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}

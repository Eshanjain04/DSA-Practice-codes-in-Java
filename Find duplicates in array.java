class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]);
                    if(nums[idx-1]>0){
                        nums[idx-1]*= -1; 
                    }
                else{
                    res.add(idx);
                }
            }
            return res;
        }
}

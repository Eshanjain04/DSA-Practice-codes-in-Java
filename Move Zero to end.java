//Simply put index pointer at 0 and and if ith pointer is non zero, swap the index pointer element and ith element and increment the index pointer

class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
            }
        }
        
    }
}

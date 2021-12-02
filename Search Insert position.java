//Given - Given a sorted array of distinct integers and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.


//We perform binary search Alogorithim
//To find the index where we have to insert the element,
//we return low index

class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while(lo <= hi){
          int mid = lo + (hi - lo)/2;
          if(nums[mid] == target){
              return mid;
          }else if(nums[mid] > target){
              hi = mid-1;
          }else{
              lo = mid+1; 
          }
        }
        return lo;
    }
}

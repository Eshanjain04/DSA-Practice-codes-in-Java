//It is basically like the voting system
//We set pointer at 1st element, then we start iteration from 2nd element and start the counter from 1
//if the pointer element is equal to ith element, we increment the counter
//else we decrement it
//when the counter reaches zero. we Restart the counter from 1 and we set the pointer to current element

//At the end of loop, We'll find our result at pointer

// then we will check if the result is greater than n/2 or not


import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int count = 1;
        int res = 0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[res]){
                count++;
            }
            else{
                count--;
            }
            
            if(count==0){
                count=1;
                res=i;
            }
        }
        
        count = 0;
        for(int i=0;i<n;i++){
            if(nums[res]==nums[i]){
                count++;
            }
        
        }
         if(count<n/2){
                return -1;
            }
        return nums[res];
    }
}

class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
        }
        int target =  sum - x ;
        int left = 0 ;
        int ans = -1;
        int curr_sum = 0;
        for ( int i = 0 ; i<nums.length ; i++){
            curr_sum+= nums[i];
            while(curr_sum > target && left<=i){
                curr_sum-=nums[left++];
            }
            if(curr_sum == target){
                ans = Math.max(ans,i-left+1);
            }
        }
        if(ans == -1){
            return -1;
        }
        return nums.length - ans;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int index=0;
        int count=1;
        //boyer-Moore Majority voting algorithm:
        for (int i=0;i<nums.length;i++){
            if (nums[i]==nums[index]){
                count++;
            }
            else{
                count--;
            }
            if (count==0){
                index=i;
                count=1;
            }
        }
        return nums[index];
        
    }
}
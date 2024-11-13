class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];
            if(cursum>maxsum){
                maxsum=cursum;  
            }
            if(cursum<0){
                cursum=0;
            }

        }
        return maxsum;
        
    }
}
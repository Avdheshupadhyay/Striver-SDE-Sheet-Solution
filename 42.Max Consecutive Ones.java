class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,ones);
            if(nums[i]==1) {
                ones++;
            }
            else{
                ones=0;
            }

        }
        return Math.max(ans,ones);
        
    }
}
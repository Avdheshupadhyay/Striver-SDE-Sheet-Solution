class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(a.contains(nums[i])){
                return nums[i];
            }
            a.add(nums[i]);
        }
        return -1;
        
    }
}
class Solution {
    public void sortColors(int[] nums) {
        List<Integer> a=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                a.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                a.add(nums[i]);
            }
        }
         for(int i=0;i<nums.length;i++){
            nums[i]=a.get(i);
        }
        
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < k; i++)
            if(max <= nums[i]){
                count = i;
                max = nums[i];
            }

        a.add(max);

        int i = 1;
        int j = i+k-1;

        while(j < nums.length){
            if(count >= i && max > nums[j]){
                a.add(max);
            }
            else if(count >= i && max <= nums[j]){
                count = j;
                max = nums[j];
                a.add(max);
            }
            else if(count < i){
                int tempMax = Integer.MIN_VALUE;

                for(int l = i; l <= j; l++)
                    if(tempMax <= nums[l]){
                        tempMax = nums[l];
                        count = l;
                    }

                max = tempMax;
                a.add(max);
            }

            i++;
            j++;
        }

        int[] ans = new int[a.size()];

        for(int x = 0; x < a.size(); x++)
            ans[x] = a.get(x);

        return ans;

        
    }
}
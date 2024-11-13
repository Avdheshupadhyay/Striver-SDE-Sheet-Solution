class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        int n=nums.length;
        for(int i=0;i<(n-k);i++){
            pq.poll();
        }
        return pq.poll();
        
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num,1);
        }


        List<Integer> ls= new ArrayList<>(map.keySet());
        Collections.sort(ls, (a,b) -> map.get(b) - map.get(a));
        int[] res= new int[k];

        for(int i=0;i<k;i++){
            res[i]=ls.get(i);
        }

        return res;

    }
}
class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        for (int i = 1; i < num; i++) {
            List<Integer> prev = ans.get(i - 1);
            List<Integer> a = new ArrayList<>();
            a.add(1); 
            for (int j = 1; j < prev.size(); j++) {
                a.add(prev.get(j - 1) + prev.get(j));
            }
            
            a.add(1);
            ans.add(a);
        }
        
        return ans;
    }
}


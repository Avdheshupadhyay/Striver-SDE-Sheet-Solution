class Solution {
    void solve(int[] cand, int target,int n,int i,List<Integer> sub,List<List<Integer>> ans){
        if(i==n){
            if(target==0){
            ans.add(new ArrayList<Integer>(sub));
            }
            return;
        }
        if(cand[i]<=target){
            sub.add(cand[i]);
            solve(cand,target-cand[i],n,i,sub,ans);
            sub.remove(sub.size()-1);
        }
        solve(cand,target,n,i+1,sub,ans);
    }
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        solve(cand,target,cand.length,0,sub,ans);
        return ans;
        
    }
}

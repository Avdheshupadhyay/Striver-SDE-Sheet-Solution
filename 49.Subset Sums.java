class Solution {
    static void solve(ArrayList<Integer> arr,int n,int idx,ArrayList<Integer> ans,int sum){
        if(idx==n){
            ans.add(sum);
            return;
        }
        solve(arr,n,idx+1,ans,sum+arr.get(idx));
        solve(arr,n,idx+1,ans,sum);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
      ArrayList<Integer>ans=new ArrayList<Integer>();
      solve(arr,n,0,ans,0);
      return ans;
    }
}
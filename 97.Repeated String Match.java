class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=1;
        String temp=a;
        while(temp.length()<a.length()+b.length()){
            if(temp.contains(b)){
                return count;
            }
            else{
                temp+=a;
                count++;
            }
        }
        if(temp.contains(b))  return count;
        return -1;   
    }
}
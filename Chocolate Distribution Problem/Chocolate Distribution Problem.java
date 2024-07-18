class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        // Arrays.sort(a);
        Collections.sort(a);
        int i =0;
        int j = m-1;
        int ans = Integer.MAX_VALUE;
        while(j<n){
            ans=Math.min(ans, a.get(j++)-a.get(i++));
        }
        return ans;
    }
}
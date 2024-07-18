class Solution {
    public int maxProfit(int[] prices) {
        int j =Integer.MAX_VALUE;
        int max = 0;
        for(int price : prices){
            if(price<j){
                j=price;
            }
            max = Math.max(max, price-j);
        }
        return max;
    }
}
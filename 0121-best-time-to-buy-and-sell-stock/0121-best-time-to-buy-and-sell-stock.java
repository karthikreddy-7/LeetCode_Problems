class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minsofar=prices[0];
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minsofar){
                minsofar=prices[i];
            }
            int profit=prices[i]-minsofar;
            if (profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}
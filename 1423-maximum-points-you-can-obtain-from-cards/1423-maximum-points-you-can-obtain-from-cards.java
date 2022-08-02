class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res = 0,sum = 0;
        int n = cardPoints.length;        
        int left = 0,right = n - k;        

        while(right < n){
            sum += cardPoints[right];
            right++;
        }
        res = sum;
        right = n - k;
        int total = sum;
        while(right < n){
            total = total - cardPoints[right] + cardPoints[left];
            res = Math.max(res,total);
            left++;
            right++;
        }
        return res;
    }
}
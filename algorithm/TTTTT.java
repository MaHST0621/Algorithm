public class TTTTT {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int len = prices.length;
        int min = prices[0];
        int max = 0;
        int res = 0;
        for (int i = 0; i < len; i++) {
            min = min < prices[i] ? min : prices[i];
            if (max < (prices[i] - min)) {
                res = i ;
                max = prices[i] - min;
            }
        }
    }
}

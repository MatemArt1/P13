public class Like13 {
    public class Solution {
        public static int zeros(int n) {
            int s = 0;
            while( n > 0 ){
                n /= 5;
                s += n;
            }

            return s;
        }
    }
}

public class Main {
    // Number of trailing zeros of N!
    /*
Write a program that will calculate the number of trailing zeros in a factorial of a given number.
     */
    public static int zeros(int n) {
        int m = 0;
        int k = 1;
        if (n < 5)  return 0;
        else
        {
            while (Math.pow(5, k) < n)
            {
                m = m + n / (int) Math.pow(5, k);
                k++;
            }
            return m;
        }
    }
    public static void main(String[] args) {
    }
}
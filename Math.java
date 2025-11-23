final class Math{


    /**
     *  Sum of power 2
     *  N = 3
     *  1^2 + 2^2 + 3^3 = 14
     */

    public static int getSumOfTow(int n){
        return (n *((2*n) +1) * (n+1)) / 6;
    }

    //=============================================================//

    /**
     *  Sum of number
     *  N = 4
     *  1 + 2 + 3 + 4 = 10
     */

    public static int getSumOfNumber(int n){
        return  (n * (n +1)) / 2;
    }

    //=============================================//



    /**
     *  Check if number is prime
     *  Time complexity O(sqrt(n))
     */
    private static final int[] primes = {2,3,5,7};

    public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;

    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }

    return true;
}

    //===========================================================//


    /**
     *  Add digits
     *  Time Complexity O(1)
     */

    public static int addDigits(int n){
        if (n == 0) return 0;
        return 1 + (n -1) % 9;
    }

    //================================================//

/**
 * Count digits 
 * Time complaxity O(1)
 */

public static int countDigits(int n){
   if(n == 0) return 0;
   n = Math.abs(n);
   return Math.log10(n) + 1;
}

//==========================================
 ====//
}
package reverseinteger_7;


//2147483647 here overflowing
//-2147483648


class Solution {
    public int reverse(int x) {
        int left = x;
        int i = 0;
        int digit = 0;
//    	System.out.print(746384741 * 10); //overflow
//    	return 0;
        long res = 0;
        while (left != 0) {
            digit =(int)((x % Math.pow(10, i + 1)) / Math.pow(10, i));
            left = left - (int)(digit * (Math.pow(10, i)));
            i++;
            res = res * 10 + digit;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
            System.out.println("digit = " + digit + " left = " + left + " res = " + res);

        }
        return (int)res;
    }
}
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x; // only two numbers that equal to itself

        int start = 1;
        int end = x;
        int mid = -1; // we say -1 because can't be neg numb so safe option or can do MIN.VALUE

        while (start <= end) {
            mid = start + (end - start) / 2; // update mid to be middle of start and end
            if ((long) mid * mid > (long) x)  // if mid squared is larger than x then update end to be a value behind mid
                end = mid - 1;
            else if ((long) mid * mid < (long) x)
                start = mid + 1; // if smaller then update start to be value after mid
            else
                return mid; // if it is equal then return it                
        }
        return Math.round(end);
    }
}
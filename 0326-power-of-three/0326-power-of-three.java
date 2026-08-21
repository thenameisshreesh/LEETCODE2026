

class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19
        return n > 0 && 1162261467 % n == 0;
    }
}

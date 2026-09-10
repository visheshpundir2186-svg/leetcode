class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int revno = 0;

        while (x > 0) {
            int lastdigit = x % 10;
            x = x / 10;
            revno = revno * 10 + lastdigit;
        }

        return original== revno;
    }
}
    

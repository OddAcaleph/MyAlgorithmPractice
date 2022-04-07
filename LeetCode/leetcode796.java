class Solution {
    public boolean rotateString(String s, String goal) {
        int i = 0;
        int l1 = s.length(), l2 = goal.length();
        if(l1 != l2) return false;
        while(i < l1) {
            while (i < l2 && goal.charAt(i) != s.charAt(0)) i++;
            if (isSame(s, goal, i)) return true;
            i++;
        }
        return false;
    }

    public boolean isSame(String a, String b, int i) {
        int l1 = a.length(), l2 = b.length();
        int j = 0;
        while (j < l1) {
            int kk = i % l2;
            if (a.charAt(j) != b.charAt(kk)) return false;
            i++;
            j++;
        }
        return true;
    }
}

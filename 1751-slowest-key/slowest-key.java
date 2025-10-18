class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length, max = releaseTimes[0], idx = 0;
        for (int i = 1; i < n; i++) {
            int ans = releaseTimes[i] - releaseTimes[i - 1];
            if(ans>max){
                max = ans;
                idx = i;
            } else if(ans == max && keysPressed.charAt(i)>keysPressed.charAt(idx)) idx = i;
        }
        return keysPressed.charAt(idx);
    }
}
package ua.GoIT.GoJAVA;

public class Solution {

    public int solution(int N) {

        int maxSequence = 0;
        int curSequence = 0;

        boolean foundFirstOne = false;

        while (N > 0) {
            if ((N % 2) == 0) {
                if (!foundFirstOne) {
                    N /= 2;
                    continue;
                } else {
                    curSequence++;
                }
            } else {
                foundFirstOne = true;
                curSequence = 0;
                maxSequence = Math.max(maxSequence, curSequence);
            }
            N /= 2;
        }

        return maxSequence;
    }
}

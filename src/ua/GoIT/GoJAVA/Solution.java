package ua.GoIT.GoJAVA;

import java.util.ArrayList;

public class Solution {

    public int solution(int N) {

        int maxSequence = 0;
        int curSequence = 0;

        ArrayList<Integer> bins = new ArrayList<>();

        while (N > 0) {
            bins.add(N % 2);
            N = N / 2;
        }

        ArrayList<Integer> binRevert = new ArrayList<>();
        for (int i = bins.size() - 1; i >= 0; i--) {
            binRevert.add(bins.get(i));
        }

        for (int br : binRevert) {
            System.out.print(br);
        }
        System.out.println();

        for (int i = 1; i < binRevert.size(); i++) {
            if (binRevert.get(i) == 0)
                curSequence++;
            else {
                curSequence = 0;
            }
            if (maxSequence < curSequence) {
                maxSequence = curSequence;
            }
        }

        return maxSequence;
    }
}

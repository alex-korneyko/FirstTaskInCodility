package ua.GoIT.GoJAVA;

import java.util.ArrayList;

public class Solution {

    public int solution(int N) {

        int maxSequence = 0;
        int curSequence = 0;

        boolean foundFirsOne = false;

        ArrayList<Boolean> bins = new ArrayList<>();

        while (N > 0) {
            bins.add((N % 2) > 0);
            N = N / 2;
        }

        //region Only for output to display
        for (int i = bins.size() - 1; i >= 0; i--) {
            System.out.print(i != 0 ? (bins.get(i) ? 1 : 0) : (bins.get(i) ? 1 : 0) + "\n");
        }
        //endregion

        for (boolean bit : bins) {

            //Searching for first one from end (in 'bins' sequence is reversed)
            if (!bit) {
                if (!foundFirsOne) {
                    continue;
                }
            } else {
                foundFirsOne = true;
            }


            if (!bit)
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

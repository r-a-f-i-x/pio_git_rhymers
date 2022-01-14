package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int START_VALUE = 0;
    int totalRejected = START_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// alt + ← ta kombinacja przełącza nas na poprzedni otwarty plik
// alt + → ta kombinacja przełącza nas na kolejny otwarty plik
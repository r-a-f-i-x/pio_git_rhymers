package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     *Zwrócenie całkowitej liczby odrzuceń
     * @return całkowita liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Zliczenie wszystkich odrzuceń
     * @param in wartość sprawdzana do stosu
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// alt + ← ta kombinacja przełącza nas na poprzedni otwarty plik
// alt + → ta kombinacja przełącza nas na kolejny otwarty plik
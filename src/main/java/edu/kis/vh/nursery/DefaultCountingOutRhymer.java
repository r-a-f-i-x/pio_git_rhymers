package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARR_SIZE = 12;
    public static final int ARR_CAPACITY = 11;
    public static final int NO_ELEMENTS = -1;
    private final int[] numbers = new int[ARR_SIZE];

    public int total = NO_ELEMENTS;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NO_ELEMENTS;
    }

    public boolean isFull() {
        return total == ARR_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return NO_ELEMENTS;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NO_ELEMENTS;
        return numbers[total--];
    }

}

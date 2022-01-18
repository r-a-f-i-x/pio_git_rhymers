package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ARR_SIZE = 12;
    private static final int START_VAL = -1;
    private static final int ARR_CAPACITY = 11;
    private static final int ERR_RET = -1;
    private final int[] numbers = new int[ARR_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = START_VAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_VAL;
    }

    public boolean isFull() {
        return total == ARR_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_RET;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_RET;
        return numbers[total--];
    }

}

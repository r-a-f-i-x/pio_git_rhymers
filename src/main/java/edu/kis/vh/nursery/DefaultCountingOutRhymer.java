package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARR_SIZE = 12;
    public static final int START_VAL = -1;
    public static final int ARR_CAPACITY = 11;
    public static final int ERR_RET = -1;
    private int[] numbers = new int[ARR_SIZE];

    public int total = START_VAL;

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

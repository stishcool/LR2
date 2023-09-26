enum TreadmillLength {
    LENGTH_500(500),
    LENGTH_1000(1000);

    private final int length;

    TreadmillLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
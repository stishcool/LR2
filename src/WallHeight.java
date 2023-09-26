enum WallHeight {
    HEIGHT_1(1),
    HEIGHT_2(2);

    private final int height;

    WallHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
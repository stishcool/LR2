class Human implements Participant {
    private String name;
    private int maxRunDistance = 1000;
    private int maxJumpHeight = 2;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(int distance) {
        return distance <= maxRunDistance;
    }

    @Override
    public boolean jump(int height) {
        return height <= maxJumpHeight;
    }
}
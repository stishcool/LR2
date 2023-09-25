class Robot implements Participant {
    private String name;
    private int maxRunDistance = 1500;
    private int maxJumpHeight = 1;

    public Robot(String name) {
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
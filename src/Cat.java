class Cat implements Participant {
    private String name;
    private int maxRunDistance = 500;
    private int maxJumpHeight = 3;

    public Cat(String name) {
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
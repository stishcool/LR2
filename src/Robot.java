class Robot implements Participant {
    private String name;
    private int maxRunDistance = 1500;
    private int maxJumpHeight = 1;
    private int extraJumps = 3;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getExtraJumps() {
        return extraJumps;
    }

    public boolean superJump(Wall wall) {
        if (wall.getHeight().getHeight() > maxJumpHeight) {
            return false;
        }
        return true;
    }


    public void useExtraJump() {
        if (extraJumps > 0) {
            extraJumps--;
        }
    }

    @Override
    public boolean run(int distance) {
        return distance <= maxRunDistance;
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            return true;
        }
        return false;
    }
}
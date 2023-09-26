class Wall implements Obstacle {
    private WallHeight height;

    public Wall(WallHeight height) {
        this.height = height;
    }

    public WallHeight getHeight() {
        return height;
    }

    @Override
    public boolean pass(Participant participant) {
        return participant.jump(height.getHeight());
    }

    @Override
    public String getDescription() {
        return "Стена " + height.getHeight() + " м";
    }
}
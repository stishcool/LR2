class Treadmill implements Obstacle {
    private TreadmillLength length;

    public Treadmill(TreadmillLength length) {
        this.length = length;
    }

    @Override
    public boolean pass(Participant participant) {
        return participant.run(length.getLength());
    }

    @Override
    public String getDescription() {
        return "Дорожка " + length.getLength() + " м";
    }
}
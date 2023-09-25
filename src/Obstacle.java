// Общий интерфейс для участников и препятствий
public interface Obstacle {
    boolean pass(Participant participant);
}
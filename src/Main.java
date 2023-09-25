public class Main {
    public static void main(String[] args) {
        // Создаем участников
        Human human = new Human("Человек");
        Cat cat = new Cat("Кот");
        Robot robot = new Robot("Робот");

        // Создаем препятствия
        Treadmill treadmill1 = new Treadmill(500);
        Wall wall1 = new Wall(1);
        Treadmill treadmill2 = new Treadmill(1000);
        Wall wall2 = new Wall(2);

        // Массив участников и препятствий
        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {treadmill1, wall1, treadmill2, wall2};

        // Проходим препятствия
        for (Participant participant : participants) {
            System.out.println("Участник: " + participant.getName());
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    if (participant.run(((Treadmill) obstacle).getLength())) {
                        System.out.println("Успешно пробежал дорожку длиной " + ((Treadmill) obstacle).getLength());
                    } else {
                        System.out.println("Не смог пробежать дорожку длиной " + ((Treadmill) obstacle).getLength());
                        break; // Если не смог пройти, прекращаем дальнейшие попытки
                    }
                } else if (obstacle instanceof Wall) {
                    if (participant.jump(((Wall) obstacle).getHeight())) {
                        System.out.println("Успешно перепрыгнул стену высотой " + ((Wall) obstacle).getHeight());
                    } else {
                        System.out.println("Не смог перепрыгнуть стену высотой " + ((Wall) obstacle).getHeight());
                        break; // Если не смог пройти, прекращаем дальнейшие попытки
                    }
                }
            }
            System.out.println();
        }
    }
}
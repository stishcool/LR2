public class Main {
    public static void main(String[] args) {
        // Создаем участников
        Human human = new Human("Человек");
        Cat cat = new Cat("Кот");
        Robot robot = new Robot("Робот");

        // Создаем препятствия
        Obstacle[] obstacles = {
                new Treadmill(TreadmillLength.LENGTH_500),
                new Wall(WallHeight.HEIGHT_1),
                new Treadmill(TreadmillLength.LENGTH_1000),
                new Wall(WallHeight.HEIGHT_2)
        };

        // Проходим препятствия
        for (Participant participant : new Participant[]{human, cat, robot}) {
            System.out.println("Участник: " + participant.getName());
            for (Obstacle obstacle : obstacles) {
                if (obstacle.pass(participant)) {
                    System.out.println(obstacle.getDescription() + " - Успешно");
                } else {
                    System.out.println(obstacle.getDescription() + " - Не смог");
                    break; // Если не смог пройти, прекращаем дальнейшие попытки
                }
            }
            System.out.println();
        }
    }
}

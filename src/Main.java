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
                boolean passed = false;
                if (obstacle.pass(participant)) {
                    System.out.println(obstacle.getDescription() + " - Успешно");
                    passed = true;
                } else if (participant instanceof Robot) {
                    Robot robotParticipant = (Robot) participant;
                    if (robotParticipant.getExtraJumps() > 0) {
                        if (obstacle instanceof Wall) { // Проверяем, является ли препятствие стеной
                            Wall wallObstacle = (Wall) obstacle;
                            if (robotParticipant.superJump(wallObstacle)) {
                                System.out.println(obstacle.getDescription() + " - Успешно с помощью superJump()");
                                passed = true;
                                robotParticipant.useExtraJump();
                            }
                        }
                    }
                }
                if (!passed) {
                    System.out.println(obstacle.getDescription() + " - Не смог");
                    break; // Если не смог пройти, прекращаем дальнейшие попытки
                }
            }
            System.out.println();
        }
    }
}
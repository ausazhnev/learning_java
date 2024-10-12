import java.lang.management.PlatformLoggingMXBean;

class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Переменные для хранения числа которое выбрал игрок
        int p1_num = 0;
        int p2_num = 0;
        int p3_num = 0;

        // Переменные для проверки угадал ли игрок
        boolean p1_is_right = false;
        boolean p2_is_right = false;
        boolean p3_is_rigth = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("я загадал число от 0 до 9...");

        while (true) {
            System.out.println("число которое нужно угадать: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1_num = p1.number;
            System.out.println("Первый игрок думает, что это число: " + p1_num);
            p2_num = p2.number;
            System.out.println("Второй игрок думает, что это число " + p2_num);
            p3_num = p3.number;
            System.out.println("Третий игрок думает, что это число " + p3_num);

            if (p1_num == targetNumber) {
                p1_is_right = true;
            }
            if (p2_num == targetNumber) {
                p2_is_right = true;
            }
            if (p3_num == targetNumber) {
                p3_is_rigth = true;
            }
            if (p1_is_right || p2_is_right || p3_is_rigth) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1_is_right);
                System.out.println("Второй игрок угадал? " + p2_is_right);
                System.out.println("Третий игрок угадал? " + p3_is_rigth);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Не кто не угадал, игра продолжается.");
            }
        }
    }
}

class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Я думаю что это число: " + number);
    }
}

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame Game = new GuessGame();
        Game.StartGame();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        String name;
        int speed;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i +":");
            name = scanner.next();

            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                speed = scanner.nextInt();
                if (speed < 0 || speed > 250) {
                    System.out.println("Неправильная скорость");
                } else {
                    break;
                }
            }

            Car car = new Car(name, speed);
            race.defineLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.getLeader());

        scanner.close();
    }
}
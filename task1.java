
import java.util.Scanner;

    public class task1 {
        public static void main(String[] args) {
            float number = readFloatFromUser();
            System.out.println("Вы ввели число: " + number);
        }

        public static float readFloatFromUser() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Ошибка! Введите дробное число: ");
                scanner.next(); // пропускаем некорректный ввод
            }
            float number = scanner.nextFloat();
            return number;
        }
    }


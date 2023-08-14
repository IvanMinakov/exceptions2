import java.util.Scanner;
public class task4 {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) { // проверяем, что строка пустая
                throw new Exception("Пустые строки вводить нельзя!"); // выбрасываем исключение
            }
            System.out.println("Вы ввели: " + input);
        }
    }


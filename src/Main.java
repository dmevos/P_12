import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Начинаем работать!");
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int lenList = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int uBound = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        var list = new ArrayList<Integer>();
        for (int i = 0; i < lenList; i++) {
            list.add(new Random().nextInt(uBound));
        }
        logger.log("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        logger.log("Запускаем фильтрацию");
        var filter = new Filter(scanner.nextInt());
        var filterList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filterList);
        logger.log("Завершаем программу");
    }
}
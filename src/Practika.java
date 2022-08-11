
import java.util.Scanner;
class Practika {
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
    Hero Jarvis = new Hero();  // создали ДЖАРВИСА из класса ХЕРО
    System.out.println("На город напали! Вы берёте бинокль и видите несколько бандитов, идущих на вас");
    System.out.println("Сколько человек вы видите?");
    int badGys= scanner.nextInt();
    System.out.println("Вы достаёте свой лаптоп и активируете защитных роботов, выберите команду:" );
    Jarvis.fillVoid(badGys);

    while (true) {
        menu();
        int command = scanner.nextInt();  // Добавить если другие цифры - шибка
        if (command == 1) {
            System.out.println("В пулемёте робота " + Jarvis.afterFight[0] + " патронов.");

            System.out.println("Выберите команду: ");

        } else if (command == 2) {
            Jarvis.fight(badGys);

        } else if (command==5) {
            System.out.println("Робот выключен и стоит в гараже.");
            break;
        } else if (command==4) {
            Jarvis.showEnemies(badGys);

        } else if (command==3) {
            Jarvis.rest();
        } else  {
            System.out.println("Выберите команду из списка.");
        }

    }
}
public static void menu(){
    System.out.println();
    System.out.println("                           1 - Показать количество патронов");
    System.out.println("                           2 - Открыть огонь по бандитам!");
    System.out.println("                           3 - Пополнить боезапас робота");
    System.out.println("                           4 - Показать сколько бандитов осталось");
    System.out.println("                           5 - Выключить робота");
}

}

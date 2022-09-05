
import java.util.Scanner;
class Practika {
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
    Hero Jarvis = new Hero();  // создали ДЖАРВИСА из класса ХЕРО
    Customer CustomerMain = new Customer();
    System.out.println("На город напали! Вы берёте бинокль и видите несколько бандитов, идущих на вас");
    System.out.println("Сколько человек вы видите?");
    int badGys= scanner.nextInt();
    while (badGys<=0){
        System.out.println("Присмотритесь, там явно кто-то есть! Посчитайте и введите их количество.");
        System.out.println("Сколько человек вы видите?");
         badGys= scanner.nextInt();
    }
    System.out.println("Вы достаёте свой лаптоп и активируете защитного робота, выберите команду:" );
    Jarvis.fillVoid(badGys);

    while (true) {
        menu();
        int command = scanner.nextInt();  // Добавить если другие цифры - 0шибка
        if (command == 1) {
            System.out.println("В пулемёте робота " + Jarvis.robotAmmo + " патронов.");
            System.out.println("Максимальный возможный боезапас: "+ CustomerMain.newmaxAmmoPossible);
            System.out.println("Максимальное пополнение патронов за раз: "+ CustomerMain.maxReloadPossible);
            System.out.println("Точность стрельбы: "+ CustomerMain.robotFire);


        } else if (command == 2) {
            Jarvis.fight();

        } else if (command==6) {
            System.out.println("Выключение программ робота...");
            System.out.println("Робот выключен и мирно стоит в гараже.");
            if (Jarvis.badGuysCount>0){
                System.out.println("А бандиты спокойно заходят в город и убивают всех.");
                System.out.println("И вас.");
            }else {
                System.out.println("Вы закрываете ноутбук и идёте домой.");
            }
            break;

        } else if (command==4) {
            Jarvis.showEnemies();

        } else if (command==3) {
            Jarvis.reload(CustomerMain);
        } else if (command == 5) {
            CustomerMain.customize();
        } else {
            System.out.println("Выберите команду из списка.");
        }

    }
}
public static void menu(){
    System.out.println("Выберите команду: ");
    System.out.println();
    System.out.println("                           1 - Показать характеристики робота: ");
    System.out.println("                           2 - Открыть огонь по бандитам!");
    System.out.println("                           3 - Пополнить боезапас робота");
    System.out.println("                           4 - Показать сколько бандитов осталось");
    System.out.println("                           5 - Модернизировать робота");
    System.out.println("                           6 - Выключить робота");


}

}

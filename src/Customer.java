import java.util.Scanner;
public  class Customer {
    int maxAmmoPossible = 200;
    int maxReloadPossible = 200;
Scanner scanner=new Scanner(System.in);
    void customize() {
        System.out.println("Добро пожаловать в меню улучшений вашего робота");
        System.out.println("Выберите улучшение:");
        while (true) {
            castMenu();
                int command = scanner.nextInt();  // Добавить если другие цифры - шибка
                if (command == 1) {
                    System.out.println("Выберите команду: ");
                }  else {
                    System.out.println("Выберите команду из списка.");
                }}}



                 void castMenu() {
                     System.out.println("        1   Увеличить магазин для патронов (позволяет пополнять боезапас до 1000 патронов)");  /* добавить в код условие что
                     пополнять можно с ограничением без этого улучшения до улучшения можно до 200                                     */
                     System.out.println("        2   Роботы-помошники (позволяют пополнять боезапас на 500 патронов за раз)");  // до этого улучшения максимум на 50
                     System.out.println("        3   Установить тепловые сканеры (позволяет вести более точную стрельбу: 1 выстрел = 1 точное попадание)");
                     System.out.println("        4   Выйти из режима улучшений");
                 }
}





                    /*
}
            в код стрельбы добавить 2 выстрела на голову  до этого улучшения
            */

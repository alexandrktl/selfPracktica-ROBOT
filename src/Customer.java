import java.util.Scanner;
public  class Customer {
    int maxAmmoPossible = 200;
    int newmaxAmmoPossible=maxAmmoPossible;
    int maxReloadPossible = 200;
    int robotFire = 0;

Scanner scanner=new Scanner(System.in);
    void customize() {
        System.out.println("Добро пожаловать в меню улучшений вашего робота");
        System.out.println("Выберите улучшение:");
        while (true) {
            castMenu();
                int command = scanner.nextInt();  // Добавить если другие цифры - шибка
            while (command<1 || command>4){
                System.out.println("Ошибка, введите правильную команду! ");
                castMenu();
                command = scanner.nextInt();
            }
                if (command == 1) {
                    newmaxAmmoPossible=increaseMaxAmmo(maxAmmoPossible);

                }  else if (command==4) {
                    System.out.println("Выход из режима модернизации робота");
                    break;
                }
        }
    }
                int increaseMaxAmmo(int maxAmmoPossible){
                    System.out.println("На сколько патронов вы хотите магазин? ");
                    int needAmmo=scanner.nextInt();
                    while (needAmmo<0){
                        System.out.println("Введите необходимый объём магазина... ");
                        needAmmo=scanner.nextInt();
                    }
                    System.out.println("Мини-боты поставили на вашего робота новый большой бокс для пуль ");
                    maxAmmoPossible=needAmmo ;
                    System.out.println("Максимальный размер магазина: " + maxAmmoPossible);
                     return  needAmmo;
    }


                 void castMenu() {
                     System.out.println("        1   Увеличить магазин для патронов ");  /* добавить в код условие что
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

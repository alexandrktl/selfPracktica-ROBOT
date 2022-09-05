
    public class Hero {
        //Customer Customerr = new Customer();
        int BadGuysLeft= 0;
        int[] afterFight= new int[2];
        int robotAmmo=100;  // патроны
        int badGuysCount=0;
        int[] fillVoid(int bad ) {
            badGuysCount=bad;
            afterFight[1] = badGuysCount;  // плохиши
            afterFight[0]=robotAmmo; // патроны
            return afterFight;
        }
        int[] reload(Customer CustomerMain){
            if(robotAmmo== CustomerMain.newmaxAmmoPossible) {
                System.out.println("Боезапас уже итак полон, карманов нет!");
                return afterFight;
            }
            robotAmmo+= CustomerMain.maxReloadPossible;
            if (robotAmmo> CustomerMain.newmaxAmmoPossible){
                robotAmmo=CustomerMain.newmaxAmmoPossible;}

            System.out.println("Боезапас успешно пополнен.");
            System.out.println("В магазинах " + robotAmmo + " патронов");
                return afterFight;
            }


        int[] fight (){
            if (badGuysCount >0 && robotAmmo >0) {
                BadGuysLeft=badGuysCount- robotAmmo;
                System.out.println("Гильзы сыпятся на землю, шум выстрелов гремит на весь город !!! ");
            System.out.println( "Ваш робот ведёт прицельную стрельбу по противнику...");
                robotAmmo -=  badGuysCount;
                if (badGuysCount>0) {
                    badGuysCount = BadGuysLeft;
                    if (BadGuysLeft<0){
                        badGuysCount=0;
                        System.out.println("Противников не осталось. Все лежат без дыхания. Вы защитили город!");
                    }
                }
                if (robotAmmo<0) {
                    robotAmmo=0;
                    System.out.println("У робота кончились патроны - дальнейшая стрельба не возможна! Необходимо пополнить боезапас!");
                }

            } else if (badGuysCount >0 && robotAmmo <1) {
                System.out.println("У робота кончились патроны - дальнейшая стрельба не возможна! Бандиты подбираются все ближе к городу! Скорее пополните его боезапас!");

            }  else  {System.out.println("Противников не осталось. А стрельба по мирным жителям запрещена! Просто стоим)");}


            //System.out.println( afterFight[1]);
            //System.out.println( afterFight[0]);
            return afterFight;

        }

        void showEnemies(){
            if (badGuysCount >0) {
                System.out.println("Осталось " + badGuysCount + " бандитов.");
            } else {
                System.out.println(" В городе не осталось бандитов. Можно спать спокойно. ");
            }

        }



    }

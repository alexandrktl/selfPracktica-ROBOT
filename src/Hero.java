
    public class Hero {


        int badAsses= 0;
        int[] afterFight= new int[2];

        int[] fillVoid(int bad ) {
            afterFight[0] = 100;
            afterFight[1] = bad;
            return afterFight;
        }
        int[] rest(){
            afterFight[0] = afterFight[0] + 50;
            System.out.println("Боезапас успешно пополнен.");
            return afterFight;
        }
        int[] fight (int bad){
            if (afterFight[1] >0 && afterFight[0] >0) {
                badAsses=afterFight[1]- afterFight[0];
                System.out.println("Гильзы сыпятся на землю, шум выстрелов гремит на весь город !!! ");
            System.out.println( "Ваш робот ведёт прицельную стрельбу по противнику...");
                afterFight[0] = afterFight[0] - afterFight[1];
                if (afterFight[0]<0) {
                    afterFight[0]=0;
                }

            } else if (afterFight[1] >0 ) {
                System.out.println("У робота кончились патроны - дальнейшая стрельба не возможна! Бандиты подбираются все ближе к городу! Скорее пополните его боезапас!");

            }  else  {System.out.println("Противников не осталось. Стрельба по мирным жителям запрещена!");}


            if (afterFight[1]>0) {
                afterFight[1] = badAsses;
                if (badAsses<0){
                    afterFight[1]=0;
                }
            }
            System.out.println( afterFight[1]);
            System.out.println( afterFight[0]);
            return afterFight;

        }
        void showEnemies(int bad){
            if (afterFight[1] >0) {
                System.out.println("Осталось " + afterFight[1] + " бандитов.");
            } else {
                System.out.println(" В городе не осталось бандитов. Можно спать спокойно. ");
            }

        }



    }

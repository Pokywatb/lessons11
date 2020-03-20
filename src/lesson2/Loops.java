package lesson2;

public class Loops {
    public static void main(String[] args) {
//        циклы - для выполнения повторяющихся действий
      /*  while (условие)  {
            тело цикла*/


        /*Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое число");
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("выход из программы");
                break;
            }
            System.out.println(num * num);
        }
*/
       /* int programNum = (int) (Math.random() * 6) + 1;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое число");
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("выход из программы");
                break;
            }
            else if ( num == programNum ){
                System.out.println("угадал");
                break;
            }
            else if ( num < programNum ){
                System.out.println("меньше");
            }
            else if ( num > programNum ){
                System.out.println("больше");
            }

        }*/

//       for
//        fori - цикл for
        for (int i = 0; i < 19; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);

        }


        }
    }




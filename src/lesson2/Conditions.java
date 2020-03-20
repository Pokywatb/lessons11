package lesson2;

// public class может быть только один!

//TODO ctrl+alt+L - выравнивание кода
//        if else
      /*  if (условие) {
            код выполнится если условие true;
        } else if (условие 2) { код выполнится если условие2 true;
    } else {выполниться, если все условия false}
}*/
public class Conditions {
    public static void main(String[] args) {
        int minute = 5;
        if (minute >= 0 && minute <= 14) {
            System.out.println("Первая четверть");
        } else if (minute >= 15 && minute <= 30) {
            System.out.println("Вторая четверть");
        } else if (minute >= 31 && minute <= 45) {
            System.out.println("Третья четверть");
        } else if (minute >= 46 && minute <= 59) {
            System.out.println("Четвертая четверть");
        } else {
            System.out.println("недопустимое значение");
        }
// switch () {}

        int code = 37;

        switch (code) {
            case 111:
            case 222:
            case 333:
                System.out.println("малый приз");
                break;
            case 444:
            case 555:
                System.out.println("средний приз");
                break;
            case 777:
                System.out.println("Крупный приз");
                break;
             default:
                 System.out.println("попробуйте еще раз");


//                 switch 12/13


        }
        /*code = 123;
        switch (code){
            case 111, 222, 333 ->System.out.println("малый приз");
            case 444, 555 -> System.out.println("средний приз");
            case 777 -> System.out.println("Крупный приз");
            default ->System.out.println("попробуйте еще раз");
        }

        String prize = switch (code) {
        case 111, 222, 333 ->"малый приз";
        case 444, 555 -> "средний приз";
        case 777 -> "Крупный приз";
        default ->"попробуйте еще раз";*/
    }
    }


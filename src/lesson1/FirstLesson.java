package lesson1;

public class FirstLesson {
//    psvm - точка входа. CTRL+ / - комментарий. CTRL + Shift + / - многострочный коммент
    public static void main(String[] args) {
// Типы данных:
//        1. Притивные типы данных
//        2. Ссылочные типы данных
//        для сохранения данных используем переменные.

//        Примитивные типы данных
//        byte - 1 байт, исп для хранения данных от -128 до +127

//        имена переменных с маленькой буквы, нет пробелов, каждое новое слово с заглавной буквы.
//        переменные можно объявлять через запятую (желательно связанные)
//        CTRL + D - копирование строки

//        Объявление переменной - это указание типа данных + присваивание имени.
        byte byteVar;
        byte byteVar3 = 35;
        byte byteVar1 = 10, byteVar2 = 20;

       byteVar = 40; // присваивание значения
        byteVar = 12; //переопределение
        // short - 2 байта от -32768 до +32767

        short shortVar1 = 300;
        short shortVar2 = 200;
       // short shortVar3 = shortVar1 + shortVar2;// результат сложения short + short  будет int
        int intVar4 = shortVar1 + shortVar2;

//        int - 4 байта
        int intVar1 = 1000;
        int intVar2 = 2_000_000;// нижние подчеркивания для удобства восприятия
       // int zero = intVar1 / 0;

//        long - 8 байт

        long longVar = 30000000000L; // L в конце явно указывает на тип long (принято ставить большую), чтобы запись не воспринималась как int

//        float - 4 байта (дробное)
        float floatVar = 5.7f; // f для явного указания на float

//        double - 8 байт (дробное)
        double doubleVar = -3.12;

        float floatVar1 = floatVar / 0;
        // sout - вывод информации в консоль
        System.out.println(floatVar1);

        double doubleVar1 = doubleVar / 0;
        System.out.println(doubleVar1);

//   TODO char - 2 байта
//        хранить номер сивола в таблице Unicode (UTF-16)
//        от 0 до 65536

        // boolean - только 2 значения: true и false

        boolean isActive = true;
        boolean isClosed = false;

//        boolean не преобразовывается

//       TODO  приведение типов
//        1. автоматическое приведение типов

        byte someByte = 10;
        int someInt = someByte;


//        2. явное приведение типов
        someInt = 100;
        someByte = (byte)someInt;

//        TODO автоматическое приеобразования происходит при увелечении контейнера.
//        TODO явное преобразование необходимо при уменьшении контейнера.


//        TODO операторы
//        1. операторы присваивания
//        =  | += (прибавить и присвоить значение) | *=  | /=  | %=

        int a = 10;
        a =+ 7; // a = a + 7;


        // арифметические операторы
//        +  |  -  |  *  |  /  |  % - взятие остатка от деления
        // 7 % 2 = 1

        a = 12;
        int b = 7;

        int c = a / b;
        System.out.println(c);
        double c1 = a / b;  // чтобы получить дробный ответ, нужно привести одну из переменных к дробной
        System.out.println(c1);

//       операторы сравнения
        // результатом работы операторов сравнения будет либо true либо false
        // >  <  >=  <=  !=(не равно)  ==(равенство)

//        инкремент (увеличение на 1)
//        i++(постфиксная форма)  ++i(префиксная форма)
//        декремент (уменьшение на 1)
//        i-- (постфиксная форма)   --i(префиксная форма)


//        консольный вывод
//         sout
      //  System.out.println("выводимая информация");
//        souf
       // System.out.printf("форматированный вывод %s \n", "данных");
//        %f для вывода чисел с плавающей точкой
//        %d для вывода целых чисел
//        %s для вывода строк


//        Консольный ввод
     //   Scanner in = new Scanner(System.in); //alt + enter
      //  System.out.println("введите число");
      //  int num = in.nextInt();
      // System.out.printf("Вы ввели число %d", num);

//     логические операторы
//        применяются к boolean переменным либо выражениям

        //  && - оператор и
        //  || - оператор или
        //  !  - оператор не
        //  ^ - исключающее или

//        тернарный оператор
//        переменная = (условие) ? выражение 1 : выражение 2;
//        если условие истинно то выражение 1, если ложно то выражение 2.

  //      a = 2;
  //      b = 3;
   //     c = a < b ? a + b : a - b;
   //     System.out.println(c);



int z = 5;

c = z % 2 == 0 ? z / 2 : z * 2;
        System.out.println(c);

 a = 2;

        int aRes = a++ - ++a + a++ + a++ + a;
        System.out.println("aRes" + aRes);











    }

}
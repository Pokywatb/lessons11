package lesson5;

import java.util.Arrays;

public class StringLesson {
    public static void main(String[] args) {
        // строки - ссылочный тип данных
//        строки до 9 Java
//        хранятся как массив char(для хранения символов)
        char charVar = 'e';
        String someStr = "jjd"; //"" - обозначение строки.
        char[] chars = {'j', 'j', 'd'};
//        строки хранятся как массив char
//        кодировка UTF-16
//        каждый символ занимает 2 байта


//        строки c 9 Java
//        хранятся как массив byte[]
//        кодировки
//        UTF-16
//        LATIN-1

        String string = "Some string"; // предпочтительный способ создания строки
        String string4 = "Some string"; // предпочтительный способ создания строки
        String string2 = new String("Some string");
        String string3 = new String("Some string");


//        сравнение строк
        System.out.println(string == string4); // при сравнении проверяется являются ли они ссылками на один и тот же объект
        System.out.println(string2 == string3);

        System.out.println(string2.equals(string3)); //в классе string метод equals - посимвольное сравнение.
//      сравнение через equals - наиболее предпочтительно.

        String newString = new String("new");
        String newString2 = newString.intern(); // помещает строку в пул строк, если такая строка уже есть, возвращается ссылка на существующую.

        System.out.println(string2 == string3);
        System.out.println(string2.intern() == string3.intern());

        //Строки в языке неизменны и потокобезопасны. Любые изменения строки приводят к созданию новой строки.

        // Конкатенация строк(объединение строк)
        String str1 = "Строка 1";
        String str2 = "Строка 2";
        String str3 = "Строка 3";

        str1 = str1 + str2; //первый способ/ ссылка на str1 удаляется, но сама строка остается.
        // каждый + это создание новой строки в пуле
        System.out.println(str1);

        str2 = str2.concat(str3).concat("Hello").concat("STR");
        // каждое использование .concat - это создание новой строки в пуле.
        System.out.println("Some Data");// такие данные тоже попадают в пул строк без ссылки.

        str3 = String.join(" ^^ ", str1, str2, str3);// объединяет строки через разделитель.
        // сначала указывается разделитель, потом строки через запятую
        System.out.println(str3);

        str1 = "Строка ";
        for (int i = 0; i < 10; i++) {
            str1 += " итерация " + i;

        }
        System.out.println(str1);
        //когда много объединений строк, то + и contat не используются (например в циклах"

        //возможность изменять строки дают объекты
        // StringBuilde или StringBuffer
        // StringBuilder - работает быстрее, нельзя использовать в многопоточных средах, не потокобезопасен
        // StringBuffe - медленный, но потокобезопасный.

        str1 = "Строка ";
        //StringBuilder sb = new StringBuilder(str1);
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append("Hello");
        System.out.println(sb);

        for (int i = 0; i < 10; i++) {
            sb.append(" итерация ").append(i);
        }
        str1 = sb.toString();//передать накопленные в sb данныве в строку.
        System.out.println(sb);// при выводе в консоль метод toString вызывается автоматически.


        char[] charsArr = {'q', 'w', 'e'};
        String charStr = new String(charsArr); //- создание строки из массива символов

        byte[] bytes = charStr.getBytes(); //- получение массива из строки
        //любую строчку можно представить как последовательность байт и наоборот.
        charStr = new String(bytes);
        System.out.println(Arrays.toString(bytes));


        //методы
        //сравнение
        str1 = "Java";
        str2 = "java";
//           возвращает true или false
        System.out.println(str1.equals(str2));//с учетом регистра
        System.out.println(str1.equalsIgnoreCase(str2));// без учета регистра


//           возвращает положительное, отрицательное или 0
        // 0 - если строки равны
        //отр - если первая меньше
        //полож - если первая больше
        System.out.println(str1.compareTo(str2));//с учетом регистра
        System.out.println(str1.compareToIgnoreCase(str2)); // без учета регистра


        System.out.println(str1.startsWith("Ja"));//проверка начинается ли строка с символов
        System.out.println(str1.endsWith("Ja"));// заканчивается ли строка символами

        str1 = str1.toLowerCase();// к нижнему регистру
        System.out.println(str1);
        str1 = str1.toUpperCase();// к верхнему регистру
        System.out.println(str1);


        str1 = "                    String";
        System.out.println(str1);
        System.out.println(str1.trim());// убирает пробелы в начала и конце


        str1 = "      STR    cc  ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());
        System.out.println(str1.trim());

str1 = "ab";
        System.out.println(str1.replace("a", "b"));

        String newS = str1.replace("a", "b");

        str1 = "Java Junior";
        String[] strings = str1.split("\\s"); // \\s - регулярное выражение,
        System.out.println(Arrays.toString(strings));
    }
}

package lesson2;

import java.util.Arrays;

public class ArraysLessson {
    public static void main(String[] args) {
//        объявление переменной массива - квадратные скобки указывают на массив
        int[] someArr;
//        int someArr[]; - тоже объявление, но не стоит.
//        элементы массива нумеруются начиная с 0. обращение к элементам по индексу.

        someArr = new int[7]; // 7 - размер массива - изменить нельзя

        System.out.println(Arrays.toString(someArr));

        int[] someArr2 = {32, 34, 45, 67, 8767, 23, 56};
        System.out.println(Arrays.toString(someArr2));

//        размер нельзя изменить, но можно узнать.(пример снизу)
        System.out.println("длинна масива" + " " + someArr.length);
        System.out.println(someArr2.length);


//        доступ к элементам массива

        // System.out.println(someArr2[2]);
        // System.out.println(someArr2[4+1]); // складываются номера элементов

        //  System.out.println(someArr2[3] + someArr2[2]);

        // System.out.println(someArr2[45]);// ArrayIndexOutOfBoundsException:


        someArr[2] = 456;
        //  System.out.println(Arrays.toString(someArr));


        someArr = new int[23];
        someArr2 = new int[]{23, 1, -10, 5};

        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] *= 2;// умножается на 2 значение под индексом i.
        }
        //  System.out.println(Arrays.toString(someArr2));

        someArr2 = new int[]{23, 1, -10, 5};
        for (int elem : someArr2) {  // работа с массивом не на прямую. массим остается нетронутым, элементы массива копируются в elem.
            elem *= 2;
            //  System.out.println(elem);
        }


        // копирование массива
        someArr2 = new int[]{23, 1, -10, 5};
//             int[] arr = someArr2; - не является копированием.(создается еще одно имя для той же последовательности.
//            еще одна ссылка на тот же самый объект

//            копирование - создание второй независимой последовательности.

//            варианты копирования:
        int[] cloneArr = someArr2.clone(); // независимые, но полностью одинаковые копии.

        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[15];
//            System.arraycopy. - меняет существующий массив.
//        с какой позиции массива 1 и на какую позицию массива 2 копировать и сколько значений

        System.arraycopy(someArr2, 1, someArr, 3, 2);

        System.out.println(Arrays.toString(someArr));


        int[] copyArr = Arrays.copyOf(someArr2, 3);// копирует массив, создавая новый определенной длинны
        System.out.println(Arrays.toString(copyArr));


//        сравнение массивов

        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[]{12, -10, 123, 6};

//        массивы  нельзя сравнивать через ==, т.к. это ссылочные типы
//        someArr == someArr2 - нельзя с массивом
//        someArr.equals(someArr2) - нельзя с массивом
        System.out.println(Arrays.equals(someArr, someArr2));


        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[]{12, -10, 123, 6};

        int[] someArr3 = new int[4];

        for (int i = 0; i < someArr.length; i++) {
            someArr3[i] = someArr[i] + someArr2[i];


        }
        System.out.println(Arrays.toString(someArr3));


//        Сортировка массивов (по возрастанию)
        someArr = new int[]{12, -10, 123, 6};
        Arrays.sort(someArr);
        System.out.println(Arrays.toString(someArr));// Arrays.sort(arr, 1, 5) - сортировка от и до

//        алгоритм быстрой сортировки, сложность 0(n log n)

//        поиск в массиве. бинарный поиск сложность 0(n log n) при бинарном поиске массив должен быть отсортирован
//        ищет элемент и возвращает индекс элемента.
        someArr = someArr = new int[]{-10, 6, 12, 123};
        System.out.println(Arrays.binarySearch(someArr, 6));
        System.out.println(Arrays.binarySearch(someArr, 15));


//        многомерные массивы - элементами массива является другой массив int [][]. в методах - deep
        int[][] newArr = new int[3][4];
        System.out.println(Arrays.deepToString(newArr));


        int[][] newArr2 = {{1, 2, 3}, {4, 5}, {6}};
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr2[1][1]);


        for (int i = 0; i < newArr2.length; i++) {
//            newArr[0] - {1, 2, 3}
            for (int j = 0; j < newArr2[i].length; j++) {
                newArr2[i][j] *= newArr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArr2));
    }
}

package ru.ifmo.lesson.lesson6;

public class Main {
    //        Синтаксис классов.
//        Все объекты создаются на основе заранее описанных классов
//        Класс - это всегда строго определенная сфера ответственности.
//        Всегда описывается только чтото одно.

//        библиотека
//        можно добавлять книги по 1 или по несколько
//        можно взять книгу (указав автора)
//        домой или для чтения в библиотеке
//        книги:
//        название
//        количество страниц
//        автор (имя фамилия)
//        можно ли брать домой
//        доступна ли для выдачи


//        класс - это шаблон будующих объектов

    public static void main(String[] args) {
        Author author1 = new Author();

//        доступ к свойству
//        author1.name = "";
//        System.out.println(author1.name);

//        Вызов метода
        author1.setName("Брюс");
        author1.setSurname("Эккель");
        System.out.println(author1.getName());

        Author author2 = new Author();
//        author2.name = "Роберт";
//        System.out.println(author2.name);
        author2.setName("Роберт");
        author2.setSurname("Мартин");
        String name = author2.getName();
        System.out.println(author2);
//        System.out.println(author2.toString());


        Book book1 = new Book("Философия Java");
        System.out.println(book1);
        book1.setPageCount(1350);
        book1.setAuthor(author1);
        book1.setForHome(true);
        System.out.println(book1);

        // если не указывать значения, задаются значения по умолчанию
        // числа - 0, boolean - false, ссылочные - null

        Book book2 = new Book("Чистый код", 500);
        System.out.println(book2);
        book2.setAuthor(author2);
        System.out.println(book2);

        String b1AN = book1.getAuthor().getName();
        System.out.println(b1AN);

        Book[] books = {book1, book2};
        //фамилию
        for (Book elem : books) {  // работа с массивом не на прямую. массим остается нетронутым, элементы массива копируются в elem.
            System.out.println(elem.getAuthor().getSurname());


        }

        Library lib = new Library();
        lib.addBook(book1, book2);


    }
}

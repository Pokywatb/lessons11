package ru.ifmo.lesson.lesson6;

public class Author {
    //    свойства (до psvm)
//    модификаторы доступа
    private String name;
    private String surname;
//    alt+insert для вызова меню генерации методов.
//    метод setter - присваивание значения свойству

    // методы
//    setName - имя метода
//    в скобках - аргументы
//    public - модификатор
    public void setName(String name) {
//        void - значит, что метод ничего не возвращает, а просто выполняет действия
//        проверка
//        !"".equals(name) - проверка пустого значения
//        name != null
        if (name.length() >= 2 && !"".equals(name)) {
            this.name = name;
        }

//        this - это ссылка на текущий объект(объект для которого вызывается метод)
    }


    // метод Getter - возврат значения
//
    public String getName() {
        return name;
//        return прекращает выполнение метода


    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

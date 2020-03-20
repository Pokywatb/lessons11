package ru.ifmo.lesson.lesson6;

//        название
//        количество страниц
//        автор (имя фамилия)
//        можно ли брать домой
//        доступна ли для выдачи
public class Book {
    private String title;
    private int pageCount;
    private Author author;
    private boolean isForHome;
    private boolean isInLibrary;

//    конструктор нужен для выполнения инструкций вмомент создания объекта
//    если в классе описан хоть один конструктор с параметрами, то конструктор без параметров будет недоступен.

    public Book() {}

    public Book(String title) {
        setTitle(title);
    }

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isForHome() {
        return isForHome;
    }

    public void setForHome(boolean forHome) {
        isForHome = forHome;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                ", isForHome=" + isForHome +
                ", isInLibrary=" + isInLibrary +
                '}';
    }


}

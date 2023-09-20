package ru.mirea.BOOK;
// автор, название, год написания, количество страниц
public class Book {
    private String author;
    private String title;
    private int year;
    private int sheets;
    public Book(String author, String title, int year, int sheets)
    {
        this.author = author;
        this.title = title;
        this.year = year;
        this.sheets = sheets;
    }
    public void set_author(String author) { this.author = author; }
    public String get_author() { return author; }
    public void set_title(String title) { this.title = title; }
    public String get_title() { return title; }
    public void set_year(int year) { this.year = year; }
    public int get_year() { return year; }
    public void set_sheets(int sheets) { this.sheets = sheets; }
    public int get_sheets() { return sheets; }
    public String to_string()
    {
        return("\nАвтор книги: " + author + "\nНазвание: " + title + "\nГод издания: " + year + "\nКоличество страниц: " + sheets);
    }
}

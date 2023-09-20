package ru.mirea.BOOK;
import java.util.ArrayList;
import java.util.Scanner;

public class BookShelf {
    private int n;
    private Book[] shelf = null;
    public BookShelf(int n)
    {
        this.n = n;
        shelf = new Book [n];
        Scanner in = new Scanner(System.in);
        String name = "", title = "";
        int year, sheets;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите имя автора: ");
            name = in.nextLine();
            System.out.println("Введите название книги: ");
            title = in.nextLine();
            System.out.println("Введите год издания: ");
            year = Integer.parseInt(in.nextLine());
            System.out.println("Введите количество страниц: ");
            sheets = Integer.parseInt(in.nextLine());
            Book book = new Book(name, title, year, sheets);
            shelf[i] = book;
        }
    }
    public Book get_newest()
    {
        Book newest = null;
        int min = 3000;
        for (int i = 0; i < n; i++) {
            if (shelf[i].get_year() < min) {
                newest = shelf[i];
            }
        }
        return newest;
    }
    public Book get_oldest()
    {
        Book oldest = null;
        int max = 0;
        for (int i = 0; i < n; i++)
        {
            if (shelf[i].get_year() > max)
            {
                oldest = shelf[i];
            }
        }
        return oldest;
    }
    public void num_order()
    {
        boolean sorted = false;
        Book buffer = null;
        while (!sorted)
        {
            sorted = true;
            for (int i = 0; i < n - 1; i++)
            {
                if (shelf[i].get_year() > shelf[i + 1].get_year())
                {
                    sorted = false;
                    buffer = shelf[i];
                    shelf[i] = shelf[i + 1];
                    shelf[i + 1] = buffer;
                }
            }
        }
    }
    public void print_num_order()
    {
        num_order();
        for (int i = 0; i < n; i++)
        {
            System.out.print(shelf[i].get_title() + " - " + shelf[i].get_year() + " год\n");
        }
    }
    public void get_books()
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(shelf[i].to_string() + "\n");
        }
    }
}

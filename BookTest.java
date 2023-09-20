package ru.mirea.BOOK;
import java.lang.*;
import java.util.Scanner;
public class BookTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Введите количество книг: ");
        n = Integer.parseInt(in.nextLine());
        BookShelf shelf = new BookShelf(n);
        shelf.get_books();
        System.out.print("\nРасстановка книг по возрастанию года издания:\n");
        shelf.print_num_order();
    }
}
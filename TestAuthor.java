package ru.mirea.AUTHOR;
import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args)
    {
        String name = "", email = "";
        char gender;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        name = in.nextLine();
        System.out.print("Введите email автора: ");
        email = in.nextLine();
        System.out.print("Введите пол автора (М или Ж): ");
        gender = in.next().charAt(0);
        Author new_author = new Author(name, email, gender);
        System.out.print(new_author.to_string());
    }
}

package ru.mirea.DOG;
import java.lang.*;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args)
    {
        int n, new_age;
        String new_name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of dogs: ");
        n = in.nextInt();
        Dog [] dogs  = new Dog[n];
        int i = 0;
        while (i < n)
        {
            System.out.print("Enter dog`s name: ");
            new_name = in.next(); //нужно проверить правильность работы с nextLine()
            System.out.print("Enter dog`s age: ");
            new_age = in.nextInt();
            dogs[i] = new Dog(new_name, new_age);
            i++;
        }
        for (int j = 0; j < n; j++)
        {
            System.out.print(dogs[j].to_string());
        }
    }
}

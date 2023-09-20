package ru.mirea.DOG;
public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void set_name(String name)
    {
        this.name = name;
    }
    public void set_age(int age)
    {
        this.age = age;
    }
    public String get_name()
    {
        return this.name;
    }
    public int get_age()
    {
        return this.age;
    }
    public int human_age()
    {
        return this.age * 7;
    }
    public String to_string()
    {
        return(name+"`s age is "+age+". It`s age in human years is "+human_age()+"\n");
    }
}

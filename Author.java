package ru.mirea.AUTHOR;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String get_name()
    {
        return name;
    }
    public String get_email()
    {
        return email;
    }
    public void set_email(String email)
    {
        this.email = email;
    }
    public char get_gender()
    {
        return gender;
    }
    public String to_string()
    {
        String gender_str = "";
        if ((gender == 'ж') || (gender == 'Ж'))
        {
            gender_str = "женский";
        }
        else if ((gender == 'м') || (gender == 'М'))
        {
            gender_str = "мужской";
        }
        else
        {
            gender_str = "test";
        }
        return ("\nИмя автора: " + name + "\nEmail: " + email + "\nПол: " + gender_str);
    }
}

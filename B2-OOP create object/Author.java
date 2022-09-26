
public class Author 
{
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender)
    {
        name = this.name;
        email = this.email;
        gender = this.gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail (String e)
    {
        email = e;   
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        String str = "Author: " + name + 
                    "Email: " + email + "Gender: " + gender;
        return str;
    }
}

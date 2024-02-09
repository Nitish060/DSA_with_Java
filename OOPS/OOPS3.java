/* CONSTRUCTOR EXAMPLE PROGRAM */

public class OOPS3
{
    public static void main(String[] args)
    {
     
        student s1 = new student("Nitish");
        System.out.println(s1.name);
    }
}

class student
{
    String name;
    int roll_no;

    student(String name)
    {
        this.name = name;
        System.out.println("Constructor is called.");
    }
}
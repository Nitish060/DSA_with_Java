/* TYPES OF CONSTRUCTOR */

public class OOPS4
{
    public static void main(String[] args)
    {
        Student s1 = new Student();   
        Student s2 = new Student("Nitish");
        System.out.println(s2.name);
        Student s3 = new Student(12);
        System.out.println(s3.roll_no);
    }
    
}

class Student
{
    String name;
    int roll_no;

    //Non-parameterized constructor
    Student()
    {
        System.out.println("Constructor is called");
    }

    //Parameterized constructors
    Student(String name)
    {
        this.name = name;
    }

    Student(int roll_no)
    {
        this.roll_no = roll_no;
    }
}
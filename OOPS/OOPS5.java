public class OOPS5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nitish";
        s1.password = "46";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println("Marks  of s1 are ");
        for(int i=0; i<s1.marks.length; i++)
        {
            System.out.println(s1.marks[i]);
        }

        System.out.println();
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        System.out.println("Marks  of s2 are ");
        for(int i=0; i<s2.marks.length; i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student
{
    String name, password;
    int roll, marks[];

    Student()// constructor 
    {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    /*Student(Student s1) // copy constructor (shallow copy)
    {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }*/

     Student(Student s1) // copy constructor (deep copy)
    {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++)
        {
            this.marks[i] = s1.marks[i];
        }
    }
}

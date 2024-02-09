/* STATIC KEYWORD */

public class OOPS13 {
    public static void main(String[] args) {
      //Student S1 = new Student();
      //S1.school_name = "SVV";
      int r1 = Student.return_percentage(90, 92, 94); // Accessing static method like this because static method is the member of the class
      System.out.println(r1);

      //Student S2 = new Student();
      //System.out.println(S2.school_name);
      int r2 = Student.return_percentage(91, 93, 95);
      System.out.println(r2);

      //Student S3 = new Student();
      //S3.school_name = "ABC";
      //System.out.println(S2.school_name);
    }
}

// First Example for static method

/*class Student{
    String name;
    int roll;

    static String school_name;
    void setName(String name){
        this.name = name;
    }
}*/

class Student{
    static int return_percentage(int math,int phy,int chem){
        return(math+phy+chem/3);
    }
}
/* BASIC EXAMPLE CODE FOR DESCRIBING OBJECT ORIENTED PROGRAMMING */

public class OOPS1 
{
    public static void main(String[] args) {

        //pen class object
        pen p1 = new pen();
       p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow"); |-Both can be used as the upper one is done through function build in the class
        //p1.color = "Yellow";   |-The second one is done by directly accessing the property of the class using dot operator
        System.out.println(p1.color);

        //syudent class object
        student s1 = new student();
        s1.calc_Percentage(98, 98, 97);
        System.out.println("Percentage of student s1 is " + s1.percentage);
    }
}

class pen
{
    String color;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }

}

class student
{
    String name;
    int age;
    float percentage;

    void calc_Percentage(float phy, float chem, float math)
    {
        percentage = (phy+chem+math)/3;
    }
}
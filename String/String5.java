public class String5 {
    public static void main(String[] args) {
        String s1 =  new String("TONY");
        String s2 = "TONY";
        String s3 = new String("TONY");

        if(s1.equals(s2)){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");
        }

        if(s1==s3){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");
        }
    }
}
/*
 In simple words, == checks if both objects point to the same memory location whereas . equals() evaluates to the comparison of values in 
 the objects. If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent 
 class that has overridden this method.
 */
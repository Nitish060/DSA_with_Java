/* Basics of ArrayList in JAVA */

import java.util.ArrayList;
public class Arl1 {
    public static void main(String[] args) {

    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(2);
    // list.add(5);
    // list.add(9);
    // list.add(3);
    // list.add(6);

        //Maximum in Arraylist
    
    // int max = Integer.MIN_VALUE;
    // for(int i=0;i<list.size();i++)
    // {
    //     if(max<list.get(i))
    //     {
    //         max = Math.max(max,list.get(i));
    //     }
    // }
    // System.out.println("Max element is "+max);


        //swap function calling
    // System.out.println("List before swapping "+list);
    // swap(list, 1, 3);
    // System.out.println("List after swapping "+list);
    
        //Multidimensional Arraylist
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++)
        {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //Nested loop

        for(int i=0; i<mainList.size(); i++)
        {
            ArrayList<Integer> currlist = mainList.get(i);
            for(int j=0; j<currlist.size(); j++)
            {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println("");
        }
    }
       // Swap 2 Numbers

    // public static void swap(ArrayList<Integer> list, int idx1, int idx2)
    // 
    //     int temp = list.get(idx2);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
    
}

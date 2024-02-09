public class Array14 
{
    
    public static void selection_Sort(int arr[])
    {
      for(int i=0; i<arr.length; i++)
      {
        int Minpas=i;
        for(int j=i+1; j<arr.length; j++)
        {
         if(arr[Minpas]>arr[j])
          {
                Minpas = j;
          }
        }
         int temp=arr[Minpas];
         arr[Minpas]=arr[i];
         arr[i]=temp;
      }
    }

    public static void print_arr(int arr[])
 {
    System.out.println("Array after selection sorting is: ");
    for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }

    public static void main(String[] args) 
    {
        int arr[] = {5,4,1,3,2};
        selection_Sort(arr);
        print_arr(arr);
    }
}



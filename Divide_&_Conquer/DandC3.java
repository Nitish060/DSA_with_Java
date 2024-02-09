public class DandC3 {

    public static int search(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        
        //case found
        if(arr[mid]==tar){
            return mid;
        }

        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a:left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                //case b:Right
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //case c:Right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                //case d: Left
                return search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0 ;
        int res = search(arr, tar, 0, arr.length-1);
        System.out.println("The target "+tar+" is found at index "+res);
    }
    
}

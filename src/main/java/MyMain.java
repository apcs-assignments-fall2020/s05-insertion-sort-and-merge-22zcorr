import java.util.ArrayList;
import java.util.Arrays;
public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> in) {
        int i =0;
        int spot = 0;
        ArrayList<Integer> out = new ArrayList<>();
        while(in.size() > out.size() ){
            if(i>out.size()-1){
                out.add(in.get(spot));
                spot++;
                i=0;
            }else if(in.get(spot)<=out.get(i)){
                out.add(i,in.get(spot));
                spot++;
                i=0;
            }else{
                i++;
            }
    }
    return out;
    }
    

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] out = new int[arr1.length+arr2.length];
        return merge(arr1,arr2,0,0,out,0);
    }
    public static int[] merge(int[] arr1, int[] arr2, int spot1, int spot2, int[] out, int outSpot){ 
        if(outSpot>=out.length){
            return out;
        }else if(arr1.length>spot1&&arr2.length>spot2  && arr1[spot1]<=arr2[spot2]||arr2.length<=spot2&&arr1.length>spot1){
            out[outSpot]=arr1[spot1];
            return merge(arr1, arr2, spot1 + 1, spot2, out, outSpot + 1);

        }else if(arr1.length>spot1&&arr2.length>spot2&&arr2[spot2]<=arr1[spot1]||arr1.length<=spot1&&arr2.length>spot2){
            out[outSpot]=arr2[spot2];
            return merge(arr1, arr2, spot1, spot2+1, out, outSpot + 1);
        }else{
          System.out.println("Bad Application: Use merge(int[],int[]) instead."); 
          return new int[]{1,1,1,1,1,1,1,1};
        }
        

    }
    

    public static void main(String[] args) {
        int[] arr1 = {3,6,4,2,6,8,5,1};
        int[] arr2 = {3,6,4};
        System.out.println(Arrays.toString(merge(arr1,arr2,10,10,arr2,2)));
    }
}


//[1, 2, 3, 4, 5, 6, 7, 8] ==> expected: <[1, 2, 3, 4, 5, 6, 7, 8]> but was: <[2, 5, 7, 8, 1, 3, 4, 6]>
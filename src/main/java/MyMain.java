import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> in) {
        ArrayList<Integer> out = new ArrayList<>();
        
        return insertionSort(in,out,0);
    }
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> in, ArrayList<Integer> out, int spot) {
        
        int i =0;
        while(in.size() > out.size() ){
        int compare = in.get(spot);
        if(i>out.size()-1){
            out.add(compare);
            spot++;
        }else if(compare<=out.get(i)){
            out.add(i,compare);
            spot++;
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
        // YOUR CODE HERE
        return null;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}

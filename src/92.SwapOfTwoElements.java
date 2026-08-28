import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SwapOfTwoElements {
    public static void main() {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(100);
        System.out.println(list);
        swap(list,0,2);
        System.out.print(list);

    }

    public static void swap(ArrayList<Integer> arrList, int ind1 , int ind2){
        Collections.swap(arrList , ind1 , ind2);
    }
}

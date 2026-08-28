import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListReverseByCollections {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,80);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }
}

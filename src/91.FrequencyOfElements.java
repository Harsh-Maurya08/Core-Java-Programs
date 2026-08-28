import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FrequencyOfElements {
    public static void main() {
        List<Integer> list = Arrays.asList(1,2,3,1,4,5,1,5,5,1,5,3,2);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 5));
        System.out.println(Collections.frequency(list, 3));
    }
}

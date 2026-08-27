import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comparators {
    public static void main() {
        List<String> newStr = Arrays.asList("Harsh" , "Maurya" , "Is" , "Best");
        System.out.println(newStr);
        listInDescending(newStr);
        System.out.print(newStr);
    }

    public static void listInDescending(List<String> str){
//        Collections.sort(str);
//        Collections.reverse(str);

        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                }
                else if(o1.charAt(0) > o2.charAt(0)){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
}

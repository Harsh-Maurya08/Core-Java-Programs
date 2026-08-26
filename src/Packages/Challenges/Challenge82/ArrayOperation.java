package Packages.Challenges.Challenge82;

public class ArrayOperation {

    int[] array = {4,8,12,16,20};

    static class Statistics{
        public int mean(int[] array){
            int sum=0;
            for(int i=0;i<array.length;i++)
               sum+=array[i];
            return sum/array.length;
        }

        public int median(int[] array){
            return 0;
        }
    }
}
